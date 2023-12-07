import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> map = new HashMap<>();
		map.put("code", 0);
		map.put("date", 1);
		map.put("maximum", 2);
		map.put("remain", 3);

		int[][] arr = Arrays.stream(data).filter(i -> i[map.get(ext)] < val_ext).toArray(int[][]::new);
		Arrays.sort(arr, Comparator.comparingInt(o -> o[map.get(sort_by)]));

		return arr;
    }
}