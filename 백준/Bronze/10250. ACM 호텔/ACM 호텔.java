import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for (int k = 0; k < t; k++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());

			String[][] arr = new String[w + 1][h + 1];
			int idx = 1;
			boolean isCheck = false;
			for (int i = 1; i <= w; i++) {
				for (int j = 1; j <= h; j++) {
					arr[i][j] = j + String.format("%02d", i);

					if (idx == n) {
						sb.append(arr[i][j]).append("\n");
						isCheck = true;
						break;
					}
					idx++;
				}

				if (isCheck) {
					break;
				}
			}
		}

		System.out.println(sb);
	}
}
