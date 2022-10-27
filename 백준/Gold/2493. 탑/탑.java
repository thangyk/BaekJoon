import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> idxStack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(st.nextToken());
            while (true) {
                if (!stack.isEmpty()) {
                    if (num < stack.peek()) {
                        sb.append(idxStack.peek() + " ");
                        stack.add(num);
                        idxStack.add(i);
                        break;
                    } else {
                        stack.pop();
                        idxStack.pop();
                    }
                } else {
                    sb.append(0 + " ");
                    stack.add(num);
                    idxStack.add(i);
                    break;
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}