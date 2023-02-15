import java.util.*;

class Solution {
    public int solution(int[] scoville, int k) {
        int result = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : scoville) {
            pq.add(i);
        }

        while (pq.peek() < k) {
            if (pq.size() == 1) {
                return -1;
            }

            pq.add(pq.poll() + pq.poll() * 2);
            result++;
        }

        return result;
    }
}