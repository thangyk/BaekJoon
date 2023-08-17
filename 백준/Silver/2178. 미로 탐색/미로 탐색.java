import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, -1, 0, 1};
	static Queue<int[]> queue = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[n + 1][m + 1];
		visited = new boolean[n + 1][m + 1];

		for (int i = 1; i < n + 1; i++) {
			String input = br.readLine();
			for (int j = 1; j < m + 1; j++) {
				arr[i][j] = input.charAt(j - 1) - '0';
			}
		}

		bfs();

		System.out.println(arr[n][m]);
	}

	static void bfs() {
		queue.add(new int[]{1, 1});
		visited[1][1] = true;

		while (!queue.isEmpty()) {
			int[] poll = queue.poll();
			int tx = poll[0];
			int ty = poll[1];

			for (int i = 0; i < 4; i++) {
				int nx = tx + dx[i];
				int ny = ty + dy[i];

				if (nx >= 1 && ny >= 1 && nx < n + 1 && ny < m + 1) {
					if (!visited[nx][ny] && arr[nx][ny] == 1) {
						arr[nx][ny] = arr[tx][ty] + 1;
						queue.add(new int[]{nx, ny});
						visited[nx][ny] = true;

					}
				}
			}
		}
	}
}