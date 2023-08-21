import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int ans = 0;
		for (int i = 1; i <= n; i++) {
			int d = d(i);

			if (d == n) {
				ans = i;
				break;
			}
		}

		System.out.println(ans);
	}

	private static int d(int n) {
		int num = n;

		while (n > 0) {
			int r = n % 10;
			n /= 10;
			num += r;
		}

		return num;
	}
}