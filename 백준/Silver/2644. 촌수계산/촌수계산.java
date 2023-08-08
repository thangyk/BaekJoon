import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int x, y;
	static ArrayList<Integer>[] adjList;
	static boolean[] visited;
	static int cnt;
	static int result = -1;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		adjList = new ArrayList[n + 1];
		visited = new boolean[n + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());

		int m = Integer.parseInt(br.readLine());

		for (int i = 1; i < n + 1; i++) {
			adjList[i] = new ArrayList<>();
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			adjList[a].add(b);
			adjList[b].add(a);
		}
		cnt = 0;
		dfs(x, y, cnt);
		System.out.println(result);
	}

	static void dfs(int s, int e, int cnt) {
		if (s == e) {
			result = cnt;
			return;
		}
		visited[s] = true;

		for (int i = 0; i < adjList[s].size(); i++) {
			int newV = adjList[s].get(i);

			if (!visited[newV]) {
				dfs(newV, e, cnt + 1);
			}
		}
	}
}