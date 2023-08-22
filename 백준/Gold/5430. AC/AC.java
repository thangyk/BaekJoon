import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	static Deque<Integer> arr;
	static String p;
	static int n;
	static boolean isFront;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int t = Integer.parseInt(br.readLine());

		StringTokenizer st;
		sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			p = br.readLine();
			n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), "[],");
			arr = new LinkedList<>();

			for (int j = 0; j < n; j++) {
				arr.add(Integer.parseInt(st.nextToken()));
			}

			ac();
		}

		System.out.println(sb);
	}

	static void ac() {
		boolean isFront = true;

		for (int i = 0; i < p.length(); i++) {
			char c = p.charAt(i);

			if (c == 'R') {
				isFront = !isFront;
				continue;
			}

			if (isFront) {
				if (arr.pollFirst() == null) {
					sb.append("error").append("\n");
					return;
				}
			} else {
				if (arr.pollLast() == null) {
					sb.append("error").append("\n");
					return;
				}
			}
		}

		sb.append('[');
		if (arr.size() > 0) {

			if (isFront) {
				sb.append(arr.pollFirst());
				while (!arr.isEmpty()) {
					sb.append(',').append(arr.pollFirst());
				}
			} else {
				sb.append(arr.pollLast());
				while (!arr.isEmpty()) {
					sb.append(',').append(arr.pollLast());
				}
			}
		}
		sb.append(']').append("\n");

	}
}