import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[50001];
		arr[0] = 0;
		arr[1] = 1;

		int n = Integer.parseInt(br.readLine());

		for (int i = 2; i <= 50000; i++) {
			int min = Integer.MAX_VALUE;

			for (int j = 1; j * j <= i; j++) {
				min = Math.min(min, arr[i - j * j]);
			}

			arr[i] = min + 1;
		}

		System.out.println(arr[n]);
	}
}