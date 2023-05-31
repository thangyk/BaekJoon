import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int light = Integer.parseInt(br.readLine());
		int[] arr = new int[light + 1];
		Arrays.fill(arr, -2);
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i < light + 1; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int students = Integer.parseInt(br.readLine());
		for (int i = 0; i < students; i++) {
			st = new StringTokenizer(br.readLine());
			int gender = Integer.parseInt(st.nextToken());
			int switchNum = Integer.parseInt(st.nextToken());

			if (gender == 1) {
				for (int j = 1; j < light + 1; j++) {
					if (j % switchNum == 0) {
						arr[j] = (arr[j] == 1 ? 0 : 1);
					}
				}
			} else {
				int left = switchNum;
				int right = switchNum;
				int cnt = 1;
				while (true) {
					if (switchNum - cnt < 0 || switchNum + cnt > light) {
						break;
					}
					if (arr[switchNum - cnt] != arr[switchNum + cnt]) {
						break;
					}

					if (arr[switchNum - cnt] == arr[switchNum + cnt]) {
						left = switchNum - cnt;
						right = switchNum + cnt;
						cnt++;
					}
				}

				for (int j = left; j <= right; j++) {
					arr[j] = (arr[j] == 1 ? 0 : 1);
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		for (int i : arr) {
			if (i == -2) {
				continue;
			}
			sb.append(i).append(" ");
			cnt++;
			if (cnt % 20 == 0) {
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}
}