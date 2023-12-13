import java.util.HashMap;
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int tmp = health;
		int lastTime = attacks[attacks.length - 1][0];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int[] ints : attacks) {
			map.put(ints[0], ints[1]);
		}

		int time = 1;
		int cnt = 1;
		while (time <= lastTime) {
			if (map.containsKey(time)) {
				tmp -= map.get(time);
				cnt = 0;
			} else {
				if (tmp < health) {
					cnt++;
					tmp += bandage[1];
				}

				if (cnt == bandage[0]) {
					cnt = 0;
					tmp += bandage[2];
				}

				if (tmp >= health) {
					tmp = health;
				}
			}

			if (tmp < 1) {
				return -1;
			}

			time++;
		}


		return tmp;
    }
}