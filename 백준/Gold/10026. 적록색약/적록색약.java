import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static boolean[][] visited;
	static char[][] arr;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, -1, 0, 1};
	static char R,G,B;
	static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());

		arr = new char[n][n];
		visited = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			for (int j = 0; j < n; j++) {
				arr[i][j] = input.charAt(j);
			}
		}

		int cnt1 = 0;
		int cnt2 = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited[i][j]) {
					dfs(i, j);
					cnt1++;
				}
			}
		}
		visited = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 'R') {
					arr[i][j] = 'G';
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited[i][j]) {
					dfs(i, j);
					cnt2++;
				}
			}
		}

		System.out.println(cnt1 + " " + cnt2);
	}

	static void dfs(int x, int y) {
		visited[x][y] = true;
		char c = arr[x][y];

		for (int i = 0; i < 4; i++) {
			int cx = x + dx[i];
			int cy = y + dy[i];

			if (cx >= 0 && cy >= 0 && cx < n && cy < n) {
				if (!visited[cx][cy] && arr[cx][cy] == c) {
					dfs(cx, cy);
				}
			}
		}
	}

}