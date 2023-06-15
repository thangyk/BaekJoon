import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String word = br.readLine();
		HashMap<Character, Integer> map = new HashMap<>();
		HashMap<Character, Integer> clone = new HashMap<>();
		char c = 'A';
		for (int i = 0; i < 26; i++) {
			map.put(c, 0);
			clone.put(c++, 0);
		}
		for (int i = 0; i < word.length(); i++) {
			c = word.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			}
		}

		int cnt = 0;
		for (int i = 0; i < n - 1; i++) {
			String words = br.readLine();
			if (Math.abs(word.length() - words.length()) > 1) {
				continue;
			}

			for (int j = 0; j < words.length(); j++) {
				char cc = words.charAt(j);
				if (clone.containsKey(cc)) {
					clone.put(cc, clone.get(cc) + 1);
				}
			}

			int diff = 0;
			c = 'A';
			for (int j = 0; j < 26; j++) {
				diff += (Math.abs(map.get(c) - clone.get(c)));
				c++;
				if (diff > 2) {
					break;
				}
			}

			if (diff < 3) {
				cnt++;
			}

			clone.clear();
			c = 'A';
			for (int j = 0; j < 26; j++) {
				clone.put(c++, 0);
			}
		}

		System.out.println(cnt);
	}
}