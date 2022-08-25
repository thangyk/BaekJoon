import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int[][] board;
    static int color;

    public static void main(String[] args) throws Exception {

        N = Integer.parseInt(br.readLine());
        board = new int[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                board[i][j] = line.charAt(j) - 48;
            }
        }

        div(0, 0, N);


        br.close();
    }

    public static boolean check(int row, int col, int N) {
        color = board[row][col];

        for (int i = row; i < row + N; i++) {
            for (int j = col; j < col + N; j++) {
                if (color != board[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void div(int row, int col, int N) {
        if (check(row, col, N)) {
            System.out.print(color);
        } else {
            System.out.print("(");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    div(row + N / 2 * i, col + N / 2 * j, N / 2);
                }
            }
            System.out.print(")");
        }
    }

}