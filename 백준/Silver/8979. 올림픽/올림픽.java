import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/11723
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] rank = new int[n + 1];

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int t = Integer.parseInt(st.nextToken());

			int sum = (Integer.parseInt(st.nextToken()) * 100) + (Integer.parseInt(st.nextToken()) * 10)
				+ (Integer.parseInt(st.nextToken()));
			rank[t] = sum;
			map.put(t, sum);
		}
		Arrays.sort(rank);
		for (int i = 1; i < n + 1; i++) {
			if (rank[i] == map.get(m)) {
				System.out.println(i);
				break;
			}
		}
	}
}