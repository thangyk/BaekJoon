import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visited;
	static ArrayList<Integer>[] adjList;
	static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		visited = new boolean[n + 1];
		adjList = new ArrayList[n + 1];
		cnt = 0;
		for (int i = 1; i <= n; i++) {
			adjList[i] = new ArrayList();
		}

		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			adjList[s].add(e);
			adjList[e].add(s);
		}

		System.out.println(dfs(1));
	}

	private static int dfs(int v) {
		visited[v] = true;
		for (int i : adjList[v]) {
			if (!visited[i]) {
				visited[i] = true;
				cnt++;
				dfs(i);
			}
		}

		return cnt;
	}
}