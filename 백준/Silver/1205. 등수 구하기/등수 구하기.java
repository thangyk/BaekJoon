import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int scoreT = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		Integer[] list = new Integer[n];
		if (n == 0) {
			System.out.println(1);
			return;
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}

		if (n == p && scoreT <= list[list.length - 1]) {
			System.out.println(-1);
		} else {
			int rank = 1;
			for (int i = 0; i < list.length; i++) {
				if (scoreT < list[i]) {
					rank++;
				} else {
					break;
				}
			}
			System.out.println(rank);
		}
	}
}