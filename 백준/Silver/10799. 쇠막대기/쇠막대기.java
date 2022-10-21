import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        Stack<Character> stack = new Stack<>();
        int ans = 0;
        stack.add(input.charAt(0));
        int bar = 1;
        for (int i = 1; i < input.length(); i++) {
            char c = input.charAt(i);

            if (stack.peek() == '(' && c == '(') {
                bar++;
                stack.push(c);
            } else if (stack.peek() == '(' && c == ')') {
                bar--;
                ans += bar;
                stack.push(c);
            } else if (stack.peek() == ')' && c == '(') {
                bar++;
                stack.push(c);
            } else {
                ans++;
                bar--;
                stack.push(c);
            }
        }

        System.out.println(ans);

        br.close();
    }
}