import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
		int result = 0;

		for (int i : tangerine) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		ArrayList<Integer> list = new ArrayList<>(map.values());
		list.sort(Collections.reverseOrder());

		for (int item : list) {
			if (k <= 0) {
				break;
			}
			k -= item;

			result++;
		}
		return result;
    }
}