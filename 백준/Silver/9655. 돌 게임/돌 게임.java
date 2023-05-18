import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/11723
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int m = Integer.parseInt(br.readLine());

		if (m % 2 == 0) {
			System.out.println("CY");
		} else {
			System.out.println("SK");
		}
	}
}