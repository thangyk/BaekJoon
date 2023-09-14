import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			int m = Integer.parseInt(br.readLine());
			Map<String, Integer> map = new HashMap<>();
			StringTokenizer st;
			for (int j = 0; j < m; j++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				String type = st.nextToken();

				map.put(type, map.getOrDefault(type, 0) + 1);
			}
			int cnt = 1;

			for (int item : map.values()) {
				cnt *= (item + 1);
			}

			sb.append(cnt - 1).append("\n");
		}

		System.out.println(sb);
	}
}