import java.util.*;
class Solution {
    public int solution(int[] array) {
        if (array.length == 1) {
			return array[0];
		}

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : array) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		int max = 0;
		int result = 0;
		for (Map.Entry<Integer, Integer> item : map.entrySet()) {
			int n = item.getValue();
			if (n > max) {
				max = n;
				result = item.getKey();
			}
		}

		int cnt = 0;
		for (Map.Entry<Integer, Integer> item : map.entrySet()) {
			if (item.getValue() == max) {
				cnt++;
			}
		}

		return cnt == 1 ? result : -1;
    }
}