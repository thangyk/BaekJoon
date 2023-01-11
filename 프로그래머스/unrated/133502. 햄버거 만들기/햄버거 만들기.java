import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int[] burgers = {1, 2, 3, 1};

        int burger = 0;
        int idx = 0;
        for (int i = 0; i < ingredient.length; i++) {
            stack.add(ingredient[i]);

            if (stack.size() >= 4 && stack.peek() == 1) {
                for (int j = burgers.length - 1; j >= 0; j--) {
                    if (stack.get(stack.size() - 1 - idx) == burgers[j]) {
                        idx++;
                    } else {
                        idx = 0;
                        break;
                    }
                }
            }

            if (idx == 4) {
                burger++;
                idx = 0;
                for (int j = 0; j < 4; j++) {
                    stack.pop();
                }
            }
        }

        return burger;
    }
}