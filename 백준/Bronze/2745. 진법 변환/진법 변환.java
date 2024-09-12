import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		String n = st.nextToken();
		int b = Integer.parseInt(st.nextToken());

		int answer = 0;
		int tmp = 1;

		for (int i = n.length() - 1; i >= 0; i--) {
			char num = n.charAt(i);

			if ('A' <= num && num <= 'Z') {
				answer += (num - 55) * tmp;
			} else {
				answer += (num - '0') * tmp;
			}

			tmp *= b;
		}

		System.out.println(answer);
	}
}