import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int left = 0;
		int right = 0;
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			arr[i] = num;
			right = Math.max(right, num);
		}
		int total = Integer.parseInt(br.readLine());

		while (left <= right) {
			int mid = (left + right) / 2;
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += Math.min(arr[i], mid);
			}

			if (sum > total) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		System.out.println(right);
	}
}