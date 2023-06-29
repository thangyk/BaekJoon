import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Map;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < rank.length; i++) {
			if (attendance[i]) {
				map.put(rank[i], i);
			}
		}

		int cnt = 0;
		int[] arr = new int[3];
		for (Integer value : map.values()) {
			arr[cnt] = value;

			cnt++;
			if (cnt == 3) {
				break;
			}
		}

		return (10000 * arr[0]) + (100 * arr[1]) + arr[2];
    }
}