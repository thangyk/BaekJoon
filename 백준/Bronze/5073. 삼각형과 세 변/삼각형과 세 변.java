import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = 0;
		int y = 0;
		int z = 0;
		StringBuilder sb = new StringBuilder();
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			z = Integer.parseInt(st.nextToken());
			int max = Math.max(x, Math.max(y, z));

			if (x == 0 && y == 0 && z == 0) {
				break;
			}
			if ((max >= x + y) || (max >= x + z) || (max >= y + z)) {
				sb.append("Invalid");
			} else if (x != y && y != z && x != z) {
				sb.append("Scalene");
			} else if (x == y && y == z) {
				sb.append("Equilateral");
			} else {
				sb.append("Isosceles");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}