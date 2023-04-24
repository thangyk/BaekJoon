import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
class Solution {
    public int solution(String s) {
        int result = 0;
		List<String> list = new ArrayList<>(Arrays.asList(s.split("")));
		Stack<String> stack = new Stack<>();

		int x = 0;
		while (x < list.size()) {
			boolean isCheck = false;

			for (String str : list) {
				if (stack.isEmpty()) {
					if (str.equals(")") || str.equals("}") || str.equals("]")) {
						isCheck = false;
						break;
					}
					stack.add(str);
					isCheck = false;
				} else {
					if (stack.peek().equals("[") && str.equals("]")) {
						stack.pop();
						isCheck = true;
					} else if (stack.peek().equals("{") && str.equals("}")) {
						isCheck = true;
						stack.pop();
					} else if (stack.peek().equals("(") && str.equals(")")) {
						isCheck = true;
						stack.pop();
					} else {
						stack.add(str);
						isCheck = false;
					}
				}
			}

			if (stack.isEmpty() && isCheck) {
				result++;
			}
			list.add(list.remove(0));

			x++;
		}

		return result;
    }
}