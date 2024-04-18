import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		int min = 100;
		int sum = 0;
		for (int i = 0; i < 7; i++) {
			int n = Integer.parseInt(br.readLine());

			if (n % 2 != 0) {
				sum += n;

				if (min > n) {
					min = n;
				}
			}
		}

		if (min == 100) {
			System.out.println(-1);
			return;
		}
		
		sb.append(sum).append("\n").append(min);
		System.out.println(sb);
	}
}