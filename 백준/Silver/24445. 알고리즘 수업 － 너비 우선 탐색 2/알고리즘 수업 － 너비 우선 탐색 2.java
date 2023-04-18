import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static boolean[] visited;
	static int[] check;
	static int idx = 0;
	static ArrayList<Integer>[] adjList;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());

		visited = new boolean[n + 1];
		check = new int[n + 1];
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
			adjList[i].sort(Collections.reverseOrder());
		}

		bfs(r);
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < check.length; i++) {
			sb.append(check[i]).append("\n");
		}
		System.out.println(sb);
	}

	private static void bfs(int v) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(v);
		visited[v] = true;

		while (!queue.isEmpty()) {
			int nowV = queue.poll();
			check[nowV] = ++idx;
			for (int i : adjList[nowV]) {
				if (!visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
	}
}