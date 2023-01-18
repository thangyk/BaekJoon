import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        if (s.length() % 2 != 0 || s.charAt(0) == ')') {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (stack.isEmpty()) {
                if (c == '(') {
                    stack.push(c);
                } else {
                    return false;
                }
            } else {
                if (c == ')') {
                    stack.pop();
                } else {
                    stack.add(c);
                }
            }
        }

        return stack.isEmpty();
    }
}