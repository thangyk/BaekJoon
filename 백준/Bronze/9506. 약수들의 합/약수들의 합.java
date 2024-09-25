import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		while (true) {
			int n = Integer.parseInt(br.readLine());

			if (n == -1) {
				break;
			}

			sb.append(factor(n)).append("\n");
		}

		System.out.println(sb);
	}

	private static String factor(int n) {
		String str = n + " = ";

		int sum = 0;
		List list = new ArrayList();
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
				list.add(i);
			}
		}

		for (int i = 0; i < list.size() - 1; i++) {
			str += list.get(i) + " + ";
		}
		str += list.get(list.size() - 1);

		if (n == sum) {
			return str;
		} else {
			return n + " is NOT perfect.";
		}
	}
}