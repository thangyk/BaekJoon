import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean[][] arr = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = st.nextToken().equals("1");
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					if (arr[j][i] && arr[i][k]) {
						arr[j][k] = true;
					}
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(arr[i][j] ? 1 : 0).append(" ");
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}
}