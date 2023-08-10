import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visited;
	static ArrayList<Integer>[] adjList;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		visited = new boolean[n + 1];
		adjList = new ArrayList[n + 1];
		arr = new int[n + 1];

		for (int i = 1; i < n + 1; i++) {
			adjList[i] = new ArrayList<>();
		}

		for (int i = 0; i < n - 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());

			adjList[s].add(e);
			adjList[e].add(s);
		}

		dfs(1);
		StringBuilder sb = new StringBuilder();
		for (int i = 2; i < n + 1; i++) {
			sb.append(arr[i]).append("\n");
		}

		System.out.println(sb);
	}

	private static void dfs(int x) {
		visited[x] = true;

		for (int i = 0; i < adjList[x].size(); i++) {
			int node = adjList[x].get(i);
			if (!visited[node]) {
				arr[node] = x;
				dfs(node);
			}
		}
	}
}