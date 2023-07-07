import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] result = new int[targets.length];
        
		Map<String, Integer> map = new HashMap<>();
		for (String value : keymap) {
			String[] split = value.split("");

			for (int j = 0; j < split.length; j++) {
				map.put(split[j], Math.min(map.getOrDefault(split[j], 101),
					j + 1));
			}
		}

		for (int i = 0; i < targets.length; i++) {
			for (int j = 0; j < targets[i].length(); j++) {
				String s = String.valueOf(targets[i].charAt(j));

				if (map.containsKey(s)) {
					result[i] += map.get(s);
				} else {
					result[i] = -1;
					break;
				}
			}
		}

		return result;
    }
}