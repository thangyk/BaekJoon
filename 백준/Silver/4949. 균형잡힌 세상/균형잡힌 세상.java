import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = "";

		StringBuilder sb = new StringBuilder();
		while (true) {
			input = br.readLine();
			if (input.equals(".")) {
				break;
			}

			Stack<Character> stack = new Stack<>();

			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);

				if (c == '[' || c == '(') {
					stack.add(c);
				} else if (!stack.isEmpty()) {
					if (stack.peek() == '(') {
						if (c == ')') {
							stack.pop();
						} else if (c == ']') {
							stack.add(c);
							break;
						}
					} else if (stack.peek() == '[') {
						if (c == ']') {
							stack.pop();
						} else if (c == ')') {
							stack.add(c);
							break;
						}
					}
				} else {
					if (c == ')' || c == ']') {
						stack.add(c);
						break;
					}
				}
			}

			if (stack.isEmpty()) {
				sb.append("yes").append("\n");
			} else {
				sb.append("no").append("\n");
			}
		}

		System.out.println(sb);
	}
}