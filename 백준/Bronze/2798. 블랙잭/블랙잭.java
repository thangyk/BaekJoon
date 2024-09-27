import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

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

		int sum = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			int a1 = arr[i];
			for (int j = i + 1; j < arr.length - 1; j++) {
				int a2 = arr[j];
				for (int k = j + 1; k < arr.length; k++) {
					int a3 = arr[k];
					if (a1 + a2 + a3 == m) {
						System.out.println(m);
						return;
					}

					if ((a1 + a2 + a3 <= m) && (a1 + a2 + a3 > sum)) {
						sum = a1 + a2 + a3;
					}
				}
			}
		}

		System.out.println(sum);
	}
}