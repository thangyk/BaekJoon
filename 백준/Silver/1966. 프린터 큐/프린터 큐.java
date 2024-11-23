import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < tc; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			Queue<int[]> queue = new LinkedList<>();
			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				int num = Integer.parseInt(st.nextToken());
				queue.add(new int[]{j, num});
				pq.add(num);
			}

			int cnt = 0;
			while (!queue.isEmpty()) {
				int[] cur = queue.poll();
				if (cur[1] == pq.peek()) {
					cnt++;
					pq.poll();
					if (cur[0] == m) {
						System.out.println(cnt);
						break;
					}
				} else {
					queue.add(cur);
				}
			}
		}
	}
}