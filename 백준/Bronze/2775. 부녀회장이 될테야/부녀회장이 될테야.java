import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(br.readLine());

		int[][] dp = new int[15][15];

		for (int i = 1; i < 15; i++) {
			dp[0][i] = i;
			dp[i][1] = 1;
		}

		for (int i = 1; i < 15; i++) {
			for (int j = 2; j < 15; j++) {
				dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < tc; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());

			sb.append(dp[k][n]).append("\n");
		}

		System.out.println(sb);
	}
}