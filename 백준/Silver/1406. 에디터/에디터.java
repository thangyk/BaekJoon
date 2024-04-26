import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		Stack<Character> L = new Stack<>();
		Stack<Character> R = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		for (char ch : line.toCharArray()) {
			L.push(ch);
		}
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String command = br.readLine();

			if (command.equals("L")) {
				if (!L.isEmpty()) {
					R.push(L.pop());
				}
			} else if (command.equals("D")) {
				if (!R.isEmpty()) {
					L.push(R.pop());
				}
			} else if (command.equals("B")) {
				if (!L.isEmpty()) {
					L.pop();
				}
			} else {
				// P
				L.push(command.charAt(2));
			}

		}

		while (!R.isEmpty()) {
			L.push(R.pop());
		}

		StringBuilder sb = new StringBuilder();
		while (!L.isEmpty()) {
			sb.append(L.pop());
		}

		System.out.println(sb.reverse().toString());

	}

}