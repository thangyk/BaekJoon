import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static int n, max, min, height;
	static boolean[][] visited;
	static int[][] arr;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, -1, 0, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		max = 0;
		min = 101;
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				max = Math.max(arr[i][j], max);
				min = Math.min(arr[i][j], min);
			}
		}

		height = min - 1;
		int answer = 0;
		int cnt;
		while (height < max) {
			visited = new boolean[n][n];
			cnt = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (!visited[i][j] && arr[i][j] > height) {
						dfs(i, j);
						cnt++;
					}
				}
			}
			answer = Math.max(answer, cnt);
			height++;
		}

		System.out.println(answer);
	}

	static void dfs(int x, int y) {
		visited[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int cx = x + dx[i];
			int cy = y + dy[i];

			if (cx >= 0 && cy >= 0 && cx < n && cy < n) {
				if (!visited[cx][cy] && arr[cx][cy] > height) {
					dfs(cx, cy);
				}
			}
		}
	}

}