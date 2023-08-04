import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static boolean[] visited;
	static ArrayList<Integer>[] adjList;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());

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

		for (int i = 1; i < n + 1; i++) {
			Collections.sort(adjList[i]);
		}

		sb = new StringBuilder();
		visited = new boolean[n + 1];
		dfs(start);
		sb.append("\n");
		visited = new boolean[n + 1];
		bfs(start);
		System.out.println(sb);
	}

	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		visited[start] = true;

		while (!queue.isEmpty()) {
			int tmp = queue.poll();
			sb.append(tmp).append(" ");
			for (int item : adjList[tmp]) {
				if (!visited[item]) {
					queue.add(item);
					visited[item] = true;
				}
			}
		}
	}

	public static void dfs(int start) {
		sb.append(start).append(" ");
		visited[start] = true;

		for (int i : adjList[start]) {
			if (!visited[i]) {
				dfs(i);
			}
		}

	}
}