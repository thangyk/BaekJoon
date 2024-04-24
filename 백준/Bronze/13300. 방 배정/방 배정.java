import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[][] arr = new int[6][2];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			arr[y-1][s]++;
		}

		int answer = 0;
		for (int[] ints : arr) {
			for (int i : ints) {
				if (i == 0) {
				} else {
					if (i % k == 0) {
						answer += i / k == 0 ? 1 : i / k;
					} else {
						answer += i / k == 0 ? 1 : (i / k) + 1;
					}
				}
			}
		}

		System.out.println(answer);
	}
}