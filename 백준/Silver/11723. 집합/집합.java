import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/11723
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int m = Integer.parseInt(br.readLine());
		HashSet<Integer> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String cmd = st.nextToken();
			if (cmd.equals("all")) {
				for (int j = 1; j < 21; j++) {
					set.add(j);
				}
				continue;
			} else if (cmd.equals("empty")) {
				set.clear();
				continue;
			}
			int x = Integer.parseInt(st.nextToken());

			switch (cmd) {
				case "add":
					set.add(x);
					break;
				case "remove":
					set.remove(x);
					break;
				case "check":
					if (set.contains(x)) {
						sb.append("1").append("\n");
					} else {
						sb.append("0").append("\n");
					}
					break;
				case "toggle":
					if (set.contains(x)) {
						set.remove(x);
					} else {
						set.add(x);
					}
					break;
			}
		}
		System.out.println(sb);
	}
}