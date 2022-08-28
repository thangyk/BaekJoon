import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int t = Integer.parseInt(br.readLine());

        int[][] dp = new int[30][30];

        for (int i = 0; i < 30; i++) {
            dp[i][i] = 1;
            dp[i][0] = 1;
        }

        for (int i = 2; i < 30; i++) {
            for (int j = 1; j < 30; j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == m) {
                sb.append(1).append("\n");
                continue;
            } else if (n == 1 | m == 1) {
                sb.append(Math.max(n, m) + "\n");
            } else {
                sb.append(dp[m][n] + "\n");
            }

        }

        System.out.println(sb);

        br.close();
    }

}