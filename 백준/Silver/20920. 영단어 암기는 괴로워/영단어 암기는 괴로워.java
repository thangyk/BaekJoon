import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 길이가 M 이상인 단어들은 Map에 저장
		// value를 기준으로 내림차순 정렬

		Map<String, Integer> map = new HashMap<>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; i++) {
			String word = br.readLine();
			if (word.length() >= m) {
				map.put(word, map.getOrDefault(word, 0) + 1);
			}
		}

		List<String> list = new ArrayList<>(map.keySet());

		list.sort((o1, o2) -> {
			int c1 = map.get(o1);
			int c2 = map.get(o2);
			if (c1 == c2) {
				if (o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				return o2.length() - o1.length();
			}
			return c2 -c1;
		});


		StringBuilder sb = new StringBuilder();
		for (String s : list) {
			sb.append(s).append("\n");
		}

		System.out.println(sb);

	}
}