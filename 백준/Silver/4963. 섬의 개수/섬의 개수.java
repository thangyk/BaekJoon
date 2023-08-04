import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dy = {0, -1, -1, -1, 0, 1, 1, 1};
	static boolean[][] visited;
	static int[][] arr;
	static int w, h, cnt;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		w = h = 51;
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			if (w == 0 && h == 0) {
				break;
			}
			arr = new int[h][w];
			visited = new boolean[h][w];

			for (int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < w; j++) {
					int map = Integer.parseInt(st.nextToken());
					arr[i][j] = map;
				}
			}

			cnt = 0;

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (!visited[i][j] && arr[i][j] == 1) {
						dfs(i, j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}

	}

	static void dfs(int x, int y) {
		visited[x][y] = true;

		for (int i = 0; i < 8; i++) {
			int cx = x + dx[i];
			int cy = y + dy[i];

			if (cx >= 0 && cy >= 0 && cx < h && cy < w) {
				if (!visited[cx][cy] && arr[cx][cy] == 1) {
					dfs(cx, cy);
				}
			}
		}
	}
}