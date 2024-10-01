import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int cnt = 1;
		int tmp = 666;
		final String six = "666";

		while (true) {
			if (n == cnt) {
				System.out.println(tmp);
				return;
			}
			tmp++;

			if (String.valueOf(tmp).contains(six)) {
				cnt++;
			}
		}
	}
}