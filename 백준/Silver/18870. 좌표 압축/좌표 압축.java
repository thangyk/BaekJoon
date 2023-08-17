import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int[] brr = arr.clone();
		Arrays.sort(arr);

		Map<Integer, Integer> map = new HashMap<>();
		int cnt = 0;

		for (int i : arr) {
			if (!map.containsKey(i)) {
				map.put(i, map.getOrDefault(i, 0) + cnt++);
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i : brr) {
			sb.append(map.get(i)).append(" ");
		}

		System.out.println(sb);
	}
}