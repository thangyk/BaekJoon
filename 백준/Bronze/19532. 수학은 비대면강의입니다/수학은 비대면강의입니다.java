import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());

		int x = -999;
		int y = -999;

		for (int i = x; i < 1000; i++) {
			for (int j = y; j < 1000; j++) {
				if (a * i + b * j == c && d * i + e * j == f) {
					System.out.println(i + " " + j);
					return;
				}
			}
		}
	}
}