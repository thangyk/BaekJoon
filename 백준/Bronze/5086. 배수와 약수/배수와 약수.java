import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		final String factor = "factor";
		final String multiple = "multiple";
		final String neither = "neither";

		StringBuilder sb = new StringBuilder();
		while (true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			if (a == 0 && b == 0) {
				System.out.println(sb);
				break;
			}

			if (b % a == 0) {
				sb.append(factor).append("\n");
			} else if (a % b == 0) {
				sb.append(multiple).append("\n");
			} else {
				sb.append(neither).append("\n");
			}
		}
	}
}