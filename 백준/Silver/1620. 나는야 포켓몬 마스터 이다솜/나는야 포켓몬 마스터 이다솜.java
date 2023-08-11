import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		Map<Integer, String> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		for (int i = 1; i < n + 1; i++) {
			String pokemon = br.readLine();

			map1.put(i, map1.getOrDefault(i, "") + pokemon);
			map2.put(pokemon, map2.getOrDefault(pokemon, 0) + i);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			String input = br.readLine();

			if (input.charAt(0) - '0' >= 0 && input.charAt(0) - '0' <= 9) {
				sb.append(map1.get(Integer.parseInt(input)));
			} else {
				sb.append(map2.get(input));
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}
}