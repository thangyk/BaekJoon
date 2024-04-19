import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int y = 0;
		int m = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int t = Integer.parseInt(st.nextToken());

			y += 10 * ((t / 30) + 1);
			m += 15 * ((t / 60) + 1);
		}

		StringBuilder sb = new StringBuilder();
		if (y == m) {
			sb.append("Y M ").append(y);
		} else if (y > m) {
			sb.append("M ").append(m);
		} else {
			sb.append("Y ").append(y);
		}

		System.out.println(sb);
	}
}