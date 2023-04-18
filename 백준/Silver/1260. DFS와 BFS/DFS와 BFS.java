import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());

		boolean[] visited = new boolean[n + 1];
		ArrayList<Integer>[] adjList = new ArrayList[n + 1];

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

		for (int i = 1; i < adjList.length; i++) {
			Collections.sort(adjList[i]);
		}

		dfs(v, visited, adjList);
		System.out.println();
		Arrays.fill(visited, false);
		bfs(v, visited, adjList);
	}

	private static void dfs(int v, boolean[] visited, ArrayList<Integer>[] adjList) {
		System.out.print(v + " ");
		visited[v] = true;

		for (int i : adjList[v]) {
			if (!visited[i]) {
				dfs(i, visited, adjList);
			}
		}
	}

	private static void bfs(int v, boolean[] visited, ArrayList<Integer>[] adjList) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(v);
		visited[v] = true;

		while (!queue.isEmpty()) {
			int nowV = queue.poll();
			System.out.print(nowV + " ");
			for (int i : adjList[nowV]) {
				if (!visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
	}
}