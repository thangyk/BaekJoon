import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ClientInfoStatus;
import java.util.*;

public class Main {
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int n, m, cnt, result;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		arr = new int[n][m];
		visited = new boolean[n][m];

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());

			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());

			for (int j = y1; j < y2; j++) {
				for (int l = x1; l < x2; l++) {
					arr[j][l] = 1;
				}
			}
		}

		result = 0;
		for (int j = 0; j < n; j++) {
			for (int l = 0; l < m; l++) {
				if (!visited[j][l] && arr[j][l] == 0) {
					cnt = 0;
					dfs(j, l);
					list.add(cnt);
					result++;
				}
			}
		}

		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		sb.append(result).append("\n");
		for (int i : list) {
			sb.append(i).append(" ");
		}

		System.out.println(sb);
	}

	private static void dfs(int x, int y) {
		visited[x][y] = true;
		++cnt;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
				if (!visited[nx][ny] && arr[nx][ny] == 0) {
					dfs(nx, ny);
				}
			}
		}
	}


}