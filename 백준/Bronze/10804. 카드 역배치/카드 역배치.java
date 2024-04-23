import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[21];
		for (int i = 1; i < 21; i++) {
			arr[i] = i;
		}

		StringTokenizer st;
		for (int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine());

			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());

			int ee = e;
			for (int j = s; j <= (s + e) / 2; j++) {
				int n = arr[j];
				arr[j] = arr[ee];
				arr[ee--] = n;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 20; i++) {
			sb.append(arr[i]).append(" ");
		}
		sb.append(arr[20]);

		System.out.println(sb);
	}
}