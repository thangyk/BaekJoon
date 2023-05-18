import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = n; i <= 1003001; i++) {
			if (isPalindrome(i) && isPrime(i)) {
				System.out.println(i);
				break;
			}
		}
	}
	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPalindrome(int n) {
		String num = String.valueOf(n);
		int left = 0;
		int right = num.length() - 1;
		while (left < right) {
			if (num.charAt(left) != num.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}