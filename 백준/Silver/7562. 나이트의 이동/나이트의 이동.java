import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, x1, y1, x2, y2;
	static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
	static int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
	static int[][] arr;
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			n = Integer.parseInt(br.readLine());
			arr = new int[n][n];
			visited = new boolean[n][n];

			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());

			bfs();

			sb.append(arr[x2][y2]).append("\n");
		}

		System.out.println(sb);
	}
	public static void bfs() {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[]{x1, y1});
		visited[x1][y1] = true;

		while (!queue.isEmpty()) {
			int[] poll = queue.poll();
			int nx = poll[0];
			int ny = poll[1];

			for (int i = 0; i < 8; i++) {
				int x = nx + dx[i];
				int y = ny + dy[i];

				if (x >= 0 && y >= 0 && x < n && y < n) {
					if (!visited[x][y]) {
						queue.add(new int[]{x, y});
						arr[x][y] = arr[nx][ny] + 1;
						visited[x][y] = true;
					}
				}
			}
		}
	}
}