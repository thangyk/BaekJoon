import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final String nice = "Nice";
		final String sad = "Sad";

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] =Integer.parseInt(st.nextToken());
		}

		Stack<Integer> stack = new Stack<>();
		int idx = 1;
		for (int i = 0; i < n; i++) {
			int num = arr[i];

			if (idx != num) {
				if (!stack.isEmpty() && stack.peek() == idx) {
					stack.pop();
					idx++;
					i--;
				} else {
					stack.add(num);
				}
			} else {
				idx++;
			}
		}

		boolean TF = true;
		while (!stack.isEmpty()) {
			if (stack.pop() == idx) {
				idx++;
			} else {
				TF = false;
				break;
			}
		}

		System.out.println(TF ? nice : sad);
	}
}