import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());

			sb.append(p(n)).append("\n");
		}

		System.out.println(sb);
	}

	static long p(int n) {
		if (n < 4) {
			return 1;
		}

		long[] dp = new long[n + 1];
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;

		for (int i = 4; i < n + 1; i++) {
			dp[i] = dp[i - 3] + dp[i - 2];
		}

		return dp[n];
	}
}