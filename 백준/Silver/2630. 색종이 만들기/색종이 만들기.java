import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int white = 0;
    static int blue = 0;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        div(arr, N, 0, 0);
        StringBuilder sb = new StringBuilder();
        sb.append(white).append('\n').append(blue);
        System.out.println(sb);

        br.close();
    }

    public static boolean isCheck(int[][] arr, int N, int row, int col) {
        for (int i = row; i < row + N; i++) {
            for (int j = col; j < col + N; j++) {
                if (arr[row][col] != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void div(int[][] arr, int N, int row, int col) {
        if (N == 1 || isCheck(arr, N, row, col)) {
            if (arr[row][col] == 1) {
                blue++;
            } else {
                white++;
            }
            return;
        }


        div(arr, N / 2, row, col);
        div(arr, N / 2, row, col + N / 2);
        div(arr, N / 2, row + N / 2, col);
        div(arr, N / 2, row + N / 2, col + N / 2);
    }
}