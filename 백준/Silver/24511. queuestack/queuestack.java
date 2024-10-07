import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		boolean[] TF = new boolean[n];
		int[] qs = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			if (Integer.parseInt(st.nextToken()) == 1) {
				TF[i] = true;
			}
		}

		Deque<Integer> dq = new LinkedList<>();

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			qs[i] = Integer.parseInt(st.nextToken());

			if (!TF[i]) {
				dq.addLast(qs[i]);
			}
		}

		int m = Integer.parseInt(br.readLine());
		int[] addNum = new int[m];
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			addNum[i] = Integer.parseInt(st.nextToken());
			dq.addFirst(addNum[i]);
			sb.append(dq.pollLast()).append(" ");
		}

		System.out.println(sb);
	}
}