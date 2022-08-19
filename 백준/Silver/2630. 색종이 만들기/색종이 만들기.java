import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] arr;
    static int white, blue = 0;

    public static boolean checkColor(int[][] arr, int N, int row, int col) {

        for (int i = row; i < row + N; i++) {
            for (int j = col; j < col + N; j++) {
                if (arr[i][j] != arr[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void div(int[][] arr, int N, int row, int col) {

        if (N == 1 || checkColor(arr, N, row, col)) {
            if (arr[row][col] == 1) {
                blue++;
            } else {
                white++;
            }
            return;
        }

       N /= 2;

        div(arr, N, row, col);
        div(arr, N, row, col + N);
        div(arr, N, row + N, col);
        div(arr, N, row + N, col + N);

    }

    public static void main(String[] args) throws Exception {

        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        div(arr, N, 0, 0);
        System.out.println(white);
        System.out.println(blue);

        br.close();
    }

}