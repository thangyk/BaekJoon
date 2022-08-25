import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static int[][] board;
    static int[] result = new int[3];

    public static void main(String[] args) throws Exception {

        N = Integer.parseInt(br.readLine());
        board = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        div(0, 0, N);

        bw.write(result[0] + "\n" + result[1] + "\n" + result[2]);

        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean check(int row, int col, int N) {
        int color = board[row][col];

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
            result[board[row][col] + 1]++;
        } else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    div(row + N / 3 * i, col + N / 3 * j, N / 3);
                }
            }
        }

    }


}