import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();

        int cnt = 0;
        for (int i = 0; i < moves.length; i++) {
            int idx = moves[i] - 1;

            for (int j = 0; j < board.length; j++) {
                int n = board[j][idx];

                if (n == 0) {
                    continue;
                }

                if (stack.isEmpty()) {
                    stack.push(n);
                    board[j][idx] = 0;
                    break;
                } else {
                    if (stack.peek() == n) {
                        stack.pop();
                        board[j][idx] = 0;
                        cnt += 2;
                    } else {
                        if (n != 0) {
                            stack.push(n);
                            board[j][idx] = 0;
                        }
                    }
                    break;
                }
            }
        }

        return cnt;
    }
}