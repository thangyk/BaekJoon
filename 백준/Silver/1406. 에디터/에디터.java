import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int n = Integer.parseInt(br.readLine());

		Stack<String> stringStack = new Stack<>();
		Stack<String> cursorStack = new Stack<>();

		for (int i = 0; i < input.length(); i++) {
			stringStack.push(String.valueOf(input.charAt(i)));
		}

		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			switch (st.nextToken()) {
				case "L":
					if (!stringStack.isEmpty()) {
						cursorStack.push(stringStack.pop());
					}
					break;
				case "D":
					if (!cursorStack.isEmpty()) {
						stringStack.push(cursorStack.pop());
					}
					break;
				case "B":
					if (!stringStack.isEmpty()) {
						stringStack.pop();
					}
					break;
				case "P":
					stringStack.push(st.nextToken());
					break;
			}
		}

		StringBuilder sb = new StringBuilder();
		while (!stringStack.isEmpty()) {
			cursorStack.push(stringStack.pop());
		}

		while (!cursorStack.isEmpty()) {
			sb.append(cursorStack.pop());
		}

		System.out.println(sb);
	}
}