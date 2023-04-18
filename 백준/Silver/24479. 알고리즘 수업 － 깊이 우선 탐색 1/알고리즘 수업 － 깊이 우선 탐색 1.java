import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visited;
	static int[] check;
	static int idx;
	static ArrayList<Integer>[] adjList;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());

		visited = new boolean[n + 1];
		check = new int[n + 1];
		adjList = new ArrayList[n + 1];
		idx = 0;

		for (int i = 1; i <= n; i++) {
			adjList[i] = new ArrayList<>();
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			adjList[s].add(e);
			adjList[e].add(s);
		}

		for (int i = 1; i <= n; i++) {
			Collections.sort(adjList[i]);
		}

		dfs(r);
		for (int i = 1; i <= n; i++) {
			sb.append(check[i]).append("\n");
		}
		System.out.println(sb.toString());
	}

	private static void dfs(int v) {
		visited[v] = true;
		check[v] = ++idx;
		for (int i : adjList[v]) {
			if (!visited[i]) {
				dfs(i);
			}
		}
	}
}