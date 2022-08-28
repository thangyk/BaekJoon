import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int k = Integer.parseInt(br.readLine());

        int[][] dp = new int[46][2];

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        if (k == 0) {
            System.out.println(1 + " " + 0);
            return;
        } else if (k == 1) {
            System.out.println(0 + " " + 1);
            return;
        }

        for (int i = 2; i <= 45; i++) {
            for (int j = 0; j < 2; j++) {
                dp[i][j] = dp[i - 2][j] + dp[i - 1][j];
            }
            if (i == k) {
                System.out.println(dp[i][0] + " " + dp[i][1]);
                break;
            }
        }

        br.close();
    }
}