import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int num = 666;
		int cnt = 1;
		String end = "666";

		while (cnt < n) {
			num++;

			if (String.valueOf(num).contains(end)) {
				cnt++;
			}
		}

		System.out.println(num);
	}
}