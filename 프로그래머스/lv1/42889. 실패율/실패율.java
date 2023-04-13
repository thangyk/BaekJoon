import java.util.*;
class Solution {
    public int[] solution(int n, int[] stages) {
        HashMap<Integer, Double> map = new HashMap<>();
		for (int i = 0; i < stages.length; i++) {
			if (stages[i] > n) {
				continue;
			}
			map.put(stages[i], map.getOrDefault(stages[i], 0.0) + 1);
		}
		System.out.println(map);

		double player = stages.length;
		for (int i = 1; i < n + 1; i++) {
			if (!map.containsKey(i)) {
				map.put(i, 0.0);
				continue;
			}
			double nowStagePlayer = map.get(i);
			map.put(i, map.get(i) / player);
			player -= nowStagePlayer;
		}
		System.out.println(map);

		List<Integer> list = new ArrayList<>(map.keySet());
		Collections.sort(list, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
		System.out.println(list);

		return list.stream().mapToInt(e -> e).toArray();
    }
}