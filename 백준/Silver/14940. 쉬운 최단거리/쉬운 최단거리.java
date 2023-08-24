import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m, x, y;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int[][] arr;
	static int[][] result;
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[n][m];
		result = new int[n][m];
		visited = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (arr[i][j] == 2) {
					x = i;
					y = j;
				}
			}
		}

		bfs();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (!visited[i][j] && arr[i][j] == 1) {
					sb.append(-1).append(" ");
				} else {
					sb.append(result[i][j]).append(" ");
				}
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}

	static void bfs() {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[]{x, y});
		visited[x][y] = true;

		while (!queue.isEmpty()) {
			int[] poll = queue.poll();
			int tx = poll[0];
			int ty = poll[1];

			for (int i = 0; i < 4; i++) {
				int nx = tx + dx[i];
				int ny = ty + dy[i];

				if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
					if (!visited[nx][ny] && arr[nx][ny] != 0) {
						queue.add(new int[]{nx, ny});
						result[nx][ny] = result[tx][ty] + 1;
						visited[nx][ny] = true;
					}
				}
			}
		}



	}


}