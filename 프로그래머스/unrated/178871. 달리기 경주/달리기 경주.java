import java.util.HashMap;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < players.length; i++) {
			map.put(players[i], i);
		}

		for (int i = 0; i < callings.length; i++) {
			String up = callings[i];

			int idx = map.get(up);
			String tmp = players[idx];
			players[idx] = players[idx - 1];
			map.put(players[idx], map.get(players[idx]) + 1);
			players[idx - 1] = tmp;

			map.put(up, map.get(up) - 1);
		}

		return players;
    }
}