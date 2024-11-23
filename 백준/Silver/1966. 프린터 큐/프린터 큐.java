import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

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

			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				int num = Integer.parseInt(st.nextToken());
				queue.add(new int[]{j, num});
			}

			if (n < 2) {
				sb.append(1).append("\n");
				continue;
			}

			int cnt = 0;
			while (true) {
				int[] cur = queue.poll();
				int max = cur[1];
				int size = queue.size();

				for (int j = 0; j < size; j++) {
					int[] tmp = queue.poll();
					if (max < tmp[1]) {
						max = tmp[1];
					}
					queue.add(tmp);
				}

				if (cur[0] == m && cur[1] == max) {
					cnt++;
					break;
				} else if (cur[1] == max) {
					cnt++;
				} else {
					queue.add(cur);
				}
			}

			sb.append(cnt).append("\n");
		}
		
		System.out.println(sb);
	}
}