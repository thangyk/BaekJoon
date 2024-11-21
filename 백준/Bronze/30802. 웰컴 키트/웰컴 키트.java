import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());

		int a1 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && arr[i] < t) {
				a1++;
			} else if (arr[i] == t) {
				a1++;
			} else {
				if (arr[i] % t == 0) {
					a1 += arr[i] / t;
				} else {
					a1 += (arr[i] / t) + 1;
				}
			}
		}

		System.out.println(a1);

		if (n % p == 0) {
			System.out.print(n / p + " ");
			System.out.println(0);
		} else {
			System.out.print(n / p + " ");
			System.out.println(n % p);
		}
	}
}
