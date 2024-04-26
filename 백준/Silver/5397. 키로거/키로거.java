import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(br.readLine());

		Stack<Character> keyLogStack = new Stack<>();
		Stack<Character> cursorStack = new Stack<>();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < tc; i++) {
			char[] input = br.readLine().toCharArray();

			for (char c : input) {
				if (c == '<') {
					if (!keyLogStack.isEmpty()) {
						cursorStack.push(keyLogStack.pop());
					}
				} else if (c == '>') {
					if (!cursorStack.isEmpty()) {
						keyLogStack.push(cursorStack.pop());
					}
				} else if (c == '-') {
					if (!keyLogStack.isEmpty()) {
						keyLogStack.pop();
					}
				} else {
					keyLogStack.push(c);
				}
			}

			while (!keyLogStack.isEmpty()) {
				cursorStack.push(keyLogStack.pop());
			}

			while (!cursorStack.isEmpty()) {
				sb.append(cursorStack.pop());
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}
}