import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());

		int sum = 0;
		int min = Integer.MAX_VALUE;
		for (int i = m; i <= n; i++) {
			if (func(i)) {
				if (sum == 0) {
					min = i;
				}

				sum += i;
			}
		}

		if (sum == 0) {
			System.out.println(-1);
			return;
		}

		System.out.println(sum);
		System.out.println(min);
	}

	private static boolean func(int i) {
		if (i == 1) {
			return false;
		}
		
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				return false;
			}
		}

		return true;
	}
}