import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] heights = new int[9];
		int sum = 0;
		
		for (int i = 0; i < 9; i++) {
			heights[i] = Integer.parseInt(br.readLine());
			sum += heights[i];
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (sum - heights[i] - heights[j] == 100) {
					heights[i] = 0;
					heights[j] = 0;
					Arrays.sort(heights);

					for (int k = 2; k < 9; k++) {
						sb.append(heights[k]).append("\n");
					}

					System.out.println(sb);
					return;
				}
			}
		}
	}
}