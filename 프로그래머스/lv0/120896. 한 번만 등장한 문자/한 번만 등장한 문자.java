import java.util.Map;
import java.util.TreeMap;
class Solution {
    public String solution(String s) {
        TreeMap<String, Integer> map = new TreeMap<>();
		StringBuilder sb = new StringBuilder();

		String[] arr = s.split("");
		for (String s1 : arr) {
			map.put(s1, map.getOrDefault(s1, 0) + 1);
		}

		for (Map.Entry<String, Integer> item : map.entrySet()) {
			if (item.getValue() == 1) {
				sb.append(item.getKey());
			}
		}

		return sb.toString();
    }
}