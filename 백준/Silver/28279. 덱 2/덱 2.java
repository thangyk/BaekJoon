import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Deque<Integer> dq = new LinkedList<>();

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int cmd = Integer.parseInt(st.nextToken());

			switch (cmd) {
				case 1:
					dq.addFirst(Integer.parseInt(st.nextToken()));
					break;
				case 2:
					dq.addLast(Integer.parseInt(st.nextToken()));
					break;
				case 3:
					if (!dq.isEmpty()) {
						sb.append(dq.pollFirst());
					} else {
						sb.append("-1");
					}
					sb.append("\n");
					break;
				case 4:
					if (!dq.isEmpty()) {
						sb.append(dq.pollLast());
					} else {
						sb.append("-1");
					}
					sb.append("\n");
					break;
				case 5:
					sb.append(dq.size()).append("\n");
					break;
				case 6:
					if (!dq.isEmpty()) {
						sb.append("0");
					} else {
						sb.append("1");
					}
					sb.append("\n");
					break;
				case 7:
					if (!dq.isEmpty()) {
						sb.append(dq.peekFirst());
					} else {
						sb.append("-1");
					}
					sb.append("\n");
					break;
				case 8:
					if (!dq.isEmpty()) {
						sb.append(dq.peekLast());
					} else {
						sb.append("-1");
					}
					sb.append("\n");
					break;
			}
		}

		System.out.println(sb);
	}
}