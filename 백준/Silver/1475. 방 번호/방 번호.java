import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[10];
		String[] brr = br.readLine().split("");

		for (String s : brr) {
			arr[Integer.parseInt(s)]++;
		}

		int max1 = 0;
		int max2 = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i == 6 || i == 9) {
				max2 += arr[i];
			} else {
				if (arr[i] > max1) {
					max1 = arr[i];
				}
			}
		}

		max2 = max2 / 2 + max2 % 2;

		System.out.println(Math.max(max1, max2));
	}
}