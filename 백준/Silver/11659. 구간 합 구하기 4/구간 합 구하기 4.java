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

		int[] arr = new int[n + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i < n + 1; i++) {
			int q = Integer.parseInt(st.nextToken());

			arr[i] = arr[i - 1] + q;
		}

		StringBuilder sb = new StringBuilder();
		for (int q = 0; q < m; q++) {

			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());

			sb.append(arr[j] - arr[i - 1]).append("\n");
		}

		System.out.println(sb);
	}
}