import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
		Queue<Integer> queue = new LinkedList<>();
		Set<Integer> set = new HashSet<>();
		queue.add(x);
		set.add(x);

		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int poll = queue.poll();

				if (poll == y) {
					return answer;
				}

				if (!set.contains(poll + n) && poll + n <= y) {
					queue.add(poll + n);
					set.add(poll + n);
				}

				if (!set.contains(poll * 2) && poll * 2 <= y) {
					queue.add(poll * 2);
					set.add(poll * 2);
				}

				if (!set.contains(poll * 3) && poll * 3 <= y) {
					queue.add(poll * 3);
					set.add(poll * 3);
				}

			}
			answer++;

		}

		return -1;
    }
}