import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] solution(int[] answers) {
        int[] p1 = {1, 2, 3, 4, 5}; //5
		int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5}; //8
		int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; //10

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == p1[i % p1.length]) {
				map.put(1, map.getOrDefault(1, 0) + 1);
			}

			if (answers[i] == p2[i % p2.length]) {
				map.put(2, map.getOrDefault(2, 0) + 1);
			}

			if (answers[i] == p3[i % p3.length]) {
				map.put(3, map.getOrDefault(3, 0) + 1);
			}
		}

		int max = Integer.MIN_VALUE;
		int cnt = 0;
		for (Map.Entry<Integer, Integer> item : map.entrySet()) {
			if (item.getValue() >= max) {
				max = item.getValue();
			}
		}

		for (Integer item : map.values()) {
			if (max == item) {
				++cnt;
			}
		}

		int[] result = new int[cnt];
		int idx = 0;
		for (Map.Entry<Integer, Integer> item : map.entrySet()) {
			if (item.getValue() == max) {
				result[idx++] = item.getKey();
			}
		}
		System.out.println(map);

		Arrays.sort(result);

		return result;
    }
}