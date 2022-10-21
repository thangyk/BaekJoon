import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            stack.clear();
            for (int j = 0; j < input.length(); j++) {
                if (stack.isEmpty()) {
                    stack.add(input.charAt(j));
                } else if (stack.peek() == '(' && input.charAt(j) == ')') {
                    stack.pop();
                } else {
                    stack.add(input.charAt(j));
                }
            }
            if (stack.isEmpty()) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }

        System.out.println(sb);
        br.close();
    }
}