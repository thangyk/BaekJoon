import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		int result = 0;
		for (int i = 0; i < n - 2; i++) {
			int a = arr[i];

			for (int j = i + 1; j < n - 1; j++) {
				int b = arr[j];

				for (int k = j + 1; k < n; k++) {
					int sum = a + b + arr[k];

					if (result < sum && sum <= m) {
						result = sum;
					}
				}
			}
		}

		System.out.println(result);
	}
}