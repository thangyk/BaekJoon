import java.util.HashMap;
import java.util.Map;
class Solution {
    static Map<String, Integer> map;
	static Map<Integer, Integer> scoreBoard;
    public String solution(String[] survey, int[] choices) {
        map = new HashMap<>();
		map.put("R", 0);
		map.put("T", 0);
		map.put("C", 0);
		map.put("F", 0);
		map.put("J", 0);
		map.put("M", 0);
		map.put("A", 0);
		map.put("N", 0);


		// 문항의 대답에 따른 value를 저장
		scoreBoard = new HashMap<>();
		for (int i = 1; i <= 7; i++) {
			scoreBoard.put(i, Math.abs(4 - i));
		}

		for (int i = 0; i < survey.length; i++) {
			String surveys = survey[i];
			int choice = choices[i];

			if (surveys.contains("A")) {
				an(surveys, choice);
			} else if (surveys.contains("C")) {
				cf(surveys, choice);
			} else if (surveys.contains("M")) {
				jm(surveys, choice);
			} else {
				rt(surveys, choice);
			}
		}

		StringBuilder sb = new StringBuilder();
		if (map.get("R") >= map.get("T")) {
			sb.append("R");
		} else {
			sb.append("T");
		}

		if (map.get("C") >= map.get("F")) {
			sb.append('C');
		} else {
			sb.append('F');
		}

		if (map.get("J") >= map.get("M")) {
			sb.append('J');
		} else {
			sb.append('M');
		}

		if (map.get("A") >= map.get("N")) {
			sb.append('A');
		} else {
			sb.append('N');
		}

		return sb.toString();
	}


	private static void rt(String survey, int score) {
		if (score == 4) {
			return;
		}

		String[] split = survey.split("");
		String a = split[0];
		String b = split[1];
		if (score < 4) {
			map.put(a, map.getOrDefault(a, 0) + scoreBoard.get(score));
		} else {
			map.put(b, map.getOrDefault(b, 0) + scoreBoard.get(score));
		}
	}

	private static void cf(String survey, int score) {
		if (score == 4) {
			return;
		}

		String[] split = survey.split("");
		String a = split[0];
		String b = split[1];
		if (score < 4) {
			map.put(a, map.getOrDefault(a, 0) + scoreBoard.get(score));
		} else {
			map.put(b, map.getOrDefault(b, 0) + scoreBoard.get(score));
		}
	}

	private static void jm(String survey, int score) {
		if (score == 4) {
			return;
		}

		String[] split = survey.split("");
		String a = split[0];
		String b = split[1];
		if (score < 4) {
			map.put(a, map.getOrDefault(a, 0) + scoreBoard.get(score));
		} else {
			map.put(b, map.getOrDefault(b, 0) + scoreBoard.get(score));
		}
	}

	private static void an(String survey, int score) {
		if (score == 4) {
			return;
		}

		String[] split = survey.split("");
		String a = split[0];
		String b = split[1];
		if (score < 4) {
			map.put(a, map.getOrDefault(a, 0) + scoreBoard.get(score));
		} else {
			map.put(b, map.getOrDefault(b, 0) + scoreBoard.get(score));
		}
	}
}