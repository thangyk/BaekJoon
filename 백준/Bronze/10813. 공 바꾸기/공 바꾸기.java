import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] basket = new int[n + 1];
		for (int i = 1; i < n + 1; i++) {
			basket[i] = i;
		}

		for (int k = 0; k < m; k++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());

			int num1 = basket[i];
			int num2 = basket[j];

			basket[i] = num2;
			basket[j] = num1;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < basket.length; i++) {
			sb.append(basket[i] + " ");
		}
		System.out.println(sb);
	}
}