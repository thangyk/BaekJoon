import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int t = Integer.parseInt(br.readLine());
        long dp[] = new long[41];

        dp[1] = 1;

        for (int i = 2; i <= 40; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) {
                sb.append("1 0\n");
                continue;
            }
            sb.append(dp[n - 1] + " " + dp[n] + "\n");
        }

        System.out.println(sb);

        br.close();
    }

}