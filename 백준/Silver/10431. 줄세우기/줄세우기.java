import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 테스트 케이스의 수 (1~1000)
		int p = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		int[] arr = new int[20];

		int cnt = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < p; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int t = Integer.parseInt(st.nextToken());
			sb.append(t).append(" ");

			for (int j = 0; j < 20; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}

			for (int k = 1; k < 20; k++) {
				if (arr[k - 1] > arr[k]) {
					int tmp = arr[k];
					arr[k] = arr[k - 1];
					arr[k-1] = tmp;
					k--;
					cnt++;
					if (k > 0) {
						k--;
					}
				}

			}
			sb.append(cnt).append("\n");
			cnt = 0;
		}

		System.out.println(sb);
	}
}