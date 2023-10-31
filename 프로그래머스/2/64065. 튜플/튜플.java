import java.util.*;
class Solution {
    public int[] solution(String s) {
        String[] str = s.substring(2, s.length() - 2).replace("},{", " ").split(" ");
		Map<Integer, Integer> map = new HashMap<>();

		for (String value : str) {
			String[] split = value.trim().split(",");
			for (String item : split) {
				int num = Integer.parseInt(item);
				map.put(num, map.getOrDefault(num, 0) + 1);
			}
		}
		int[] answer = new int[map.size()];
		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i).getKey();
		}

		return answer;
    }
}