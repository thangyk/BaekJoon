import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(br.readLine());

		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < tc; i++) {
			int[] arr = new int[26];
			st = new StringTokenizer(br.readLine());
			boolean isPossible = true;

			String str1 = st.nextToken();
			String str2 = st.nextToken();

			for (int j = 0; j < str1.length(); j++) {
				arr[str1.charAt(j) - 97]++;
			}

			for (int j = 0; j < str2.length(); j++) {
				arr[str2.charAt(j) - 97]--;
			}

			for (int i1 : arr) {
				if (i1 != 0) {
					isPossible = false;
					break;
				}
			}

			sb.append(isPossible ? "Possible" : "Impossible");
			sb.append("\n");
		}

		System.out.println(sb);
	}
}