import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < people.length; i++) {
            dq.offer(people[i]);
        }

        while (!dq.isEmpty()) {
            int data = dq.pollLast();
            if (!dq.isEmpty()) {
                if (dq.peekFirst() + data <= limit) {
                    dq.pollFirst();
                }
            }
            answer++;
        }

        return answer;
    }
}