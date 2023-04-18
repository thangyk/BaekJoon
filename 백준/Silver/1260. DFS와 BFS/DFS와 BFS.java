import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static boolean[] visited;
	static ArrayList<Integer>[] adjList;
	static StringBuilder sb;
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());

		visited = new boolean[n + 1];
		adjList = new ArrayList[n + 1];

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

		sb = new StringBuilder();
		dfs(v);
		System.out.println(sb.toString());
		sb = new StringBuilder();
		visited = new boolean[n + 1];
		bfs(v);
		System.out.println(sb.toString());
	}

	private static void dfs(int v) {
		visited[v] = true;
		sb.append(v).append(" ");
		for (int i : adjList[v]) {
			if (!visited[i]) {
				dfs(i);
			}
		}
	}

	private static void bfs(int v) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(v);
		visited[v] = true;

		while (!queue.isEmpty()) {
			int nowV = queue.poll();
			sb.append(nowV).append(" ");
			for (int i : adjList[nowV]) {
				if (!visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
	}
}