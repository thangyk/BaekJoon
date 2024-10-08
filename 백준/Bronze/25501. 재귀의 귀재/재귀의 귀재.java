import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int cnt;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			cnt = 0;
			int palindrome = isPalindrome(str);
			sb.append(palindrome).append(" ").append(cnt);
			sb.append("\n");
		}

		System.out.println(sb);
	}

	private static int recursion(String str, int l, int r) {
		cnt++;
		if (l >= r) {
			return 1;
		} else if (str.charAt(l) != str.charAt(r)) {
			return 0;
		} else {
			return recursion(str, l + 1, r - 1);
		}
	}

	private static int isPalindrome(String str) {
		return recursion(str, 0, str.length() - 1);
	}
}