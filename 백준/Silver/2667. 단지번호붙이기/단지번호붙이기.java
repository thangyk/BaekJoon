import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static boolean[][] visited;
	static int[][] arr;
	static int n, num;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, -1, 0, 1};
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());

		arr = new int[n][n];
		visited = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String[] split = st.nextToken().split("");
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(split[j]);
			}
		}

		int cnt = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				num = 0;
				if (!visited[i][j] && arr[i][j] == 1) {
					dfs(i, j);
					cnt++;
					list.add(num);
				}
			}
		}
		sb.append(cnt).append("\n");

		Collections.sort(list);
		for (int i : list) {
			sb.append(i).append("\n");
		}

		System.out.println(sb);
	}

	public static void dfs(int x, int y) {
		visited[x][y] = true;
		++num;
		for (int i = 0; i < 4; i++) {
			int cx = x + dx[i];
			int cy = y + dy[i];

			if (cx >= 0 && cy >= 0 && cx < n && cy < n) {
				if (!visited[cx][cy] && arr[cx][cy] == 1) {
					dfs(cx, cy);
				}
			}
		}
	}

}