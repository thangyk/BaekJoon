import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		if (n == 1) {
			System.out.println("A");
			return;
		}

		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		if (n == 2 && arr[0] != arr[1]) {
			System.out.println("A");
			return;
		} else if (n == 2) {
			System.out.println(arr[0]);
			return;
		}

		int[] ab = new int[2];
		if (arr[0] == arr[1]) {
			ab[0] = 1;
		} else {
			ab[0] = (arr[2] - arr[1]) / (arr[1] - arr[0]);
			ab[1] = arr[1] - (arr[0] * ab[0]);	
		}
		
		for (int i = 1; i < n; i++) {
			if (arr[i] != ((arr[i - 1] * ab[0]) + ab[1])) {
				System.out.println("B");
				return;
			}
		}

		System.out.println(arr[n - 1] * ab[0] + ab[1]);
	}
}