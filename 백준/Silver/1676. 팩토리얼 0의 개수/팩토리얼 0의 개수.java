import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;

		BigInteger bigInteger = new BigInteger("1");
		for (int i = 2; i <= n; i++) {
			bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
		}

		String s = bigInteger.toString();
		for (int i = s.length() - 1; i > 1; i--) {
			char c = (char) (s.charAt(i) - '0');
			if (c == 0) {
				cnt++;
			} else {
				break;
			}
		}

		System.out.println(cnt);

	}

}