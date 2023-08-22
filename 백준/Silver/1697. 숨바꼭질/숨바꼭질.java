import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, k;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		bfs();
	}

	static void bfs() {
		if (n == k) {
			System.out.println(0);
			return;
		}
		int[] visited = new int[100_001];
		Queue<Integer> queue = new LinkedList<>();
		queue.add(n);


		while (!queue.isEmpty()) {
			int tmp = queue.poll();

			for (int i = 0; i < 3; i++) {
				int nx = tmp;

				if (i == 0) {
					nx = tmp + 1;
				} else if (i == 1) {
					nx = tmp - 1;
				} else {
					nx = tmp * 2;
				}

				if (nx >= 0 && nx < 100001 && visited[nx] == 0) {
					queue.add(nx);
					visited[nx] = visited[tmp] + 1;
				}

				if (nx == k) {
					System.out.println(visited[nx]);
					return;
				}
			}
		}
	}

}