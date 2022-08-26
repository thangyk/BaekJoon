import java.io.*;

public class Main {
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        dp = new int[n + 1];

        bw.write(String.valueOf(cal(n)));

        bw.flush();
        bw.close();
        br.close();
    }

    public static int cal(int n) {
        if (n == 1) {
            return 0;
        }

        if (dp[n] != 0) return dp[n];

        if (n % 6 == 0) {
            dp[n] = Math.min(cal(n - 1), Math.min(cal(n / 3), cal(n / 2))) + 1;
        } else if (n % 3 == 0) {
            dp[n] = Math.min(cal(n / 3), cal(n - 1)) + 1;
        } else if (n % 2 == 0) {
            dp[n] = Math.min(cal(n / 2), cal(n - 1)) + 1;
        } else {
            dp[n] = cal(n - 1) + 1;
        }

        return dp[n];
    }
}