import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		boolean[] isCheck = new boolean[10001];
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < 10001; i++) {
			int n = d(i);
			
			if (n < 10001) {
				isCheck[n] = true;
			}
		}

		for (int i = 1; i < 10001; i++) {
			if (!isCheck[i]) {
				sb.append(i).append("\n");
			}
		}

		System.out.println(sb);
	}

	private static int d(int n) {
		int sum = n;

		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}

		return sum;
	}

}