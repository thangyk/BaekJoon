import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final String same3 = "Equilateral";
		final String same2 = "Isosceles";
		final String same0 = "Scalene";
		final String error = "Error";

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());

		if (a + b + c != 180) {
			System.out.println(error);
			return;
		}

		if (a == b && b == c) {
			System.out.println(same3);
			return;
		}

		if (a == b || a == c || b == c) {
			System.out.println(same2);
			return;
		}

		System.out.println(same0);
	}
}