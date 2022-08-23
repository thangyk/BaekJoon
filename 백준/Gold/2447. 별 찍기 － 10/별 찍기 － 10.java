import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static char[][] pattern;

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        pattern = new char[N][N];

        for (int i = 0; i < N; i++) {
            Arrays.fill(pattern[i], ' ');
        }

        div(0, 0, N);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(pattern[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }

    public static void div(int row, int col, int N) {
        if (N == 1) {
            pattern[row][col] = '*';
            return;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (i == 1 && j == 1) {
                    continue;
                }

                div(row + ((N / 3) * i), col + ((N / 3) * j), N / 3);
            }
        }
        return;
    }
}
