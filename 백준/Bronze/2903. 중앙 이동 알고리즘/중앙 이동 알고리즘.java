import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[16];
		dp[0] = 4;
		dp[1] = 9;
		dp[2] = 25;
		for (int i = 3; i <= 15; i++) {
			dp[i] = (int) Math.pow((Math.sqrt(dp[i - 1]) * 2) - 1, 2);
		}

		System.out.println(dp[n]);
	}
}