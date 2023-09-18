import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		ArrayList<ArrayList<Integer>> dp = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}

		for (int i = 0; i < n; i++) {
			dp.add(new ArrayList<>());
		}

		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			while (st.hasMoreTokens()) {
				int num = Integer.parseInt(st.nextToken());
				list.get(i).add(num);
			}
		}

		dp.get(0).add(0, list.get(0).get(0));

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < list.get(i).size(); j++) {
				int pre0 = dp.get(i - 1).get(0);
				int tmp = list.get(i).get(j);
				int end = dp.get(i - 1).get(list.get(i - 1).size() - 1);

				if (j == 0) {
					dp.get(i).add(j, pre0 + tmp);
					continue;
				}

				if (j == list.get(i).size() - 1) {
					dp.get(i).add(j, end + tmp);
					continue;
				}

				dp.get(i).add(j, Math.max(dp.get(i - 1).get(j - 1), dp.get(i - 1).get(j)) + tmp);
			}
		}

		int max = -1;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, dp.get(n - 1).get(i));
		}

		System.out.println(max);
	}
}