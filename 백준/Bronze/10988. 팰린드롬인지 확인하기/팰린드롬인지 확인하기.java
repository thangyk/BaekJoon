import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			char leftC = s.charAt(left);
			char rightC = s.charAt(right);

			if (leftC != rightC) {
				System.out.println(0);
				return;
			}

			left++;
			right--;

		}

		System.out.println(1);
	}
}