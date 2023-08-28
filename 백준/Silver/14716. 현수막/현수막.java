import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static int n, m;
	static int[] dx = {-1, 0, 1, 0, -1, 1, 1, -1};
	static int[] dy = {0, -1, 0, 1, -1, -1, 1, 1};
	static int[][] arr;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[n][m];
		visited = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int cnt = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 1 && !visited[i][j]) {
					dfs(i, j);
					cnt++;
				}
			}
		}

		System.out.println(cnt);
	}

	static void dfs(int x, int y) {
		visited[x][y] = true;

		for (int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
				if (!visited[nx][ny] && arr[nx][ny] == 1) {
					dfs(nx, ny);
				}
			}
		}
	}

}