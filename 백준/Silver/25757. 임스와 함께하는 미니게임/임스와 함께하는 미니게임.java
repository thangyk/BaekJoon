import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		String game = st.nextToken();
		int players = 0;
		switch (game) {
			case "Y":
				players = 2;
				break;
			case "F":
				players = 3;
				break;
			default:
				players = 4;
				break;
		}

		Set<String> set = new HashSet<>();
		int ans = 0;
		int cnt = 1;
		for (int i = 0; i < n; i++) {
			String player = br.readLine();

			if (!set.contains(player)) {
				set.add(player);
				cnt++;
			}

			if (cnt == players) {
				cnt = 1;
				ans++;
			}
		}

		System.out.println(ans);
	}
}