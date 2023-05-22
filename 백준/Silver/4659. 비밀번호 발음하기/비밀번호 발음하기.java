import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final String ok = " is acceptable.";
		final String not = " is not acceptable.";
		String input = "";
		char[] cArr = {'a', 'e', 'i', 'o', 'u'};
		StringBuilder sb = new StringBuilder();

		while (true) {
			input = br.readLine();
			if (input.equals("end")) {
				break;
			}

			boolean isCheck = true;
			for (char c : cArr) {
				if (input.contains(String.valueOf(c))) {
					isCheck = true;
					break;
				}
				isCheck = false;
			}
			if (!isCheck) {
				sb.append("<").append(input).append(">").append(not).append("\n");
				continue;
			}

			for (int i = 1; i < input.length() - 1; i++) {
				char pre = input.charAt(i - 1);
				char cur = input.charAt(i);
				char pos = input.charAt(i + 1);

				if (pre == 'a' || pre == 'i' || pre == 'o' || pre == 'e' || pre == 'u') {
					if (cur == 'a' || cur == 'i' || cur == 'o' || cur == 'e' || cur == 'u') {
						if (pos == 'a' || pos == 'i' || pos == 'o' || pos == 'e' || pos == 'u') {
							isCheck = false;
							break;
						}
					}
				}

				if (pre != 'a' && pre != 'i' && pre != 'o' && pre != 'e' && pre != 'u') {
					if (cur != 'a' && cur != 'i' && cur != 'o' && cur != 'e' && cur != 'u') {
						if (pos != 'a' && pos != 'i' && pos != 'o' && pos != 'e' && pos != 'u') {
							isCheck = false;
							break;
						}
					}
				}

			}
			if (!isCheck) {
				sb.append("<").append(input).append(">").append(not).append("\n");
				continue;
			}

			for (int i = 1; i < input.length(); i++) {
				char pre = input.charAt(i - 1);
				char cur = input.charAt(i);

				if (pre == cur) {
					if (!(pre == 'o' || pre == 'e')) {
						isCheck = false;
						break;
					}
				}
			}
			if (!isCheck) {
				sb.append("<").append(input).append(">").append(not).append("\n");
				continue;
			}

			sb.append("<").append(input).append(">").append(ok).append("\n");
		}
		System.out.println(sb);
	}
}