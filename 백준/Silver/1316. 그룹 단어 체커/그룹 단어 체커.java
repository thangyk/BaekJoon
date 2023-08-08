import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<Character> set = new HashSet<>();

		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			String word = br.readLine();
			set.clear();
			boolean isCheck = true;
			for (int j = 0; j < word.length() - 1; j++) {
				char c = word.charAt(j);
				if (c == word.charAt(j + 1)) {
					continue;
				}
				if (c != word.charAt(j + 1)) {
					if (!set.contains(c)) {
						set.add(c);
					} else {
						isCheck = false;
						break;
					}
				}
			}
			if (set.contains(word.charAt(word.length() - 1))) {
				isCheck = false;
			}

			if (isCheck) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}