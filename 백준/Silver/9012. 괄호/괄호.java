import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Stack stack = new Stack();
            String str = br.readLine();

            boolean isPair = true;

            for (String s : str.split("")) {
                if (s.equals("(")) {
                    stack.push(s);
                } else {
                    if (stack.isEmpty()) {
                        isPair = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (stack.isEmpty() && isPair) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }


        br.close();


    }
}
