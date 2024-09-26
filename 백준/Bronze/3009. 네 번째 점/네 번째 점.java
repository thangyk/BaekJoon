import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arrX = new int[1001];
		int[] arrY = new int[1001];

		int x = 0;
		int y = 0;

		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			arrX[a]++;
			arrY[b]++;
		}

		for (int i = 1; i < 1001; i++) {
			if (x != 0 && y != 0) {
				break;
			}

			if (arrX[i] == 1) {
				x = i;
			}

			if (arrY[i] == 1) {
				y = i;
			}
		}

		System.out.println(x + " " + y);
	}
}