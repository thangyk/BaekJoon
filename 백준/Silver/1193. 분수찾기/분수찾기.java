import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int cur = 1;
		int pre = 0;

		while (true) {
			if (n <= cur + pre) {
				if (cur % 2 == 1) {
					System.out.println(cur - (n - pre - 1) + "/" + (n - pre));
					break;
				} else {
					System.out.println((n - pre) + "/" + (cur - (n - pre - 1)));
					break;
				}
			} else {
				pre += cur;
				cur++;
			}
		}
	}
}