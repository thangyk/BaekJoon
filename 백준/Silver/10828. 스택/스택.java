import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static int checkEmpty(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return 1;
        }

        return 0;
    }

    static int checkTop(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return -1;
        }

        return stack.peek();
    }

    static int checkPop(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return -1;
        }

        return stack.remove(stack.size() - 1);

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer cmd = new StringTokenizer(br.readLine(), " ");


            switch (cmd.nextToken()) {
                case "push":
                    stack.add(Integer.parseInt(cmd.nextToken()));
                    break;
                case "pop":
                    System.out.println(checkPop(stack));
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(checkEmpty(stack));
                    break;
                case "top":
                    System.out.println(checkTop(stack));
                    break;
            }
        }

        br.close();

    }

}