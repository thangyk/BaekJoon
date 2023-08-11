import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Set<String> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(br.readLine());
		}

		List<String> list = new ArrayList<>(set);
		list.sort((o1, o2) -> {
				if (o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				return o1.length() - o2.length();
			}
		);

		StringBuilder sb = new StringBuilder();
		for (String s : list) {
			sb.append(s).append("\n");
		}

		System.out.println(sb);
	}
}