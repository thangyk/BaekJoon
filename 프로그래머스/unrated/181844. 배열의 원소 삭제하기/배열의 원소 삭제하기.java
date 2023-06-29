import java.util.Arrays;
import java.util.HashSet;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        HashSet<Integer> set = new HashSet<>();
		for (int k : arr) {
			for (int i : delete_list) {
				if (k == i) {
					set.add(k);
				}
			}
		}
		int len = arr.length - set.size();
		int[] result = new int[len];
		int idx = 0;
		for (int j : arr) {
			if (!set.contains(j)) {
				result[idx++] = j;
				if (idx == len) {
					break;
				}
			}
		}


		return result;
    }
}