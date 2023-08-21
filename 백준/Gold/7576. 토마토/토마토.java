import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int m, n, cnt;
	static int[][] arr;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, -1, 0, 1};
	static Queue<int[]> queue = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());

		arr = new int[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (arr[i][j] == 1) {
					queue.add(new int[]{i, j});
				}
			}
		}

		cnt = 0;
		bfs();

		for (int[] i : arr) {
			for (int j : i) {
				if (j == 0) {
					System.out.println(-1);
					return;
				}

				cnt = Math.max(cnt, j);
			}
		}

		System.out.println(cnt - 1);
	}

	static void bfs() {
		while (!queue.isEmpty()) {
			int[] poll = queue.poll();
			int tx = poll[0];
			int ty = poll[1];

			for (int i = 0; i < 4; i++) {
				int nx = tx + dx[i];
				int ny = ty + dy[i];

				if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
					if (arr[nx][ny] == 0) {
						queue.add(new int[]{nx, ny});
						arr[nx][ny] = arr[tx][ty] + 1;
					}
				}
			}
		}
	}
}