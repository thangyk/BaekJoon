import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < n; i++) {
			for (int j = i; j < n; j++) {
				sb.append(" ");
			}
			for (int j = 0; j < 2 * i - 1; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		for (int i = 0; i < 2 * n - 1; i++) {
			sb.append("*");
		}
		System.out.println(sb);
	}
}