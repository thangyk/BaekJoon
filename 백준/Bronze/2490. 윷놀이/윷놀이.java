import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] crr = {'D', 'C', 'B', 'A', 'E'};

		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());

			sb.append(crr[a + b + c + d]).append("\n");
		}

		System.out.println(sb);
	}
}