import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int max = -1;
		int x = 0;
		int y = 0;

		for (int i = 1; i < 10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j < 10; j++) {
				int n = Integer.parseInt(st.nextToken());
				if (max < n) {
					max = n;
					x = i;
					y = j;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append(max).append("\n").append(x).append(" ").append(y);
		System.out.println(sb);
	}
}