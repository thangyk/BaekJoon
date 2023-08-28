import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m, x, y, cnt;
	static char[][] arr;
	static boolean[][] visited;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, -1, 0, 1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new char[n][m];
		visited = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			for (int j = 0; j < m; j++) {
				arr[i][j] = input.charAt(j);
				if (arr[i][j] == 'I') {
					x = i;
					y = j;
				}
			}
		}

		bfs();

		if (cnt > 0) {
			System.out.println(cnt);
		} else {
			System.out.println("TT");
		}
	}

	static void bfs() {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[]{x, y});
		visited[x][y] = true;

		while (!queue.isEmpty()) {
			int[] poll = queue.poll();
			int tx = poll[0];
			int ty = poll[1];
			if (arr[tx][ty] == 'P') {
				cnt++;
			}

			for (int i = 0; i < 4; i++) {
				int nx = tx + dx[i];
				int ny = ty + dy[i];

				if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
					if (!visited[nx][ny] && arr[nx][ny] != 'X') {
						queue.add(new int[]{nx, ny});
						visited[nx][ny] = true;
					}
				}
			}
		}
	}

}