import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[][] arr = new int[n][3];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int[][] dp = new int[n][3];
		dp[0][0] = arr[0][0];
		dp[0][1] = arr[0][1];
		dp[0][2] = arr[0][2];

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 0) {
					dp[i][j] = arr[i][j] + Math.min(dp[i - 1][1], dp[i - 1][2]);
					continue;
				}

				if (j == 1) {
					dp[i][j] = arr[i][j] + Math.min(dp[i - 1][0], dp[i - 1][2]);
					continue;
				}

				dp[i][j] = arr[i][j] + Math.min(dp[i - 1][0], dp[i - 1][1]);
			}
		}

		int ans = Math.min(dp[n - 1][0], Math.min(dp[n - 1][1], dp[n - 1][2]));

		System.out.println(ans);
	}
}