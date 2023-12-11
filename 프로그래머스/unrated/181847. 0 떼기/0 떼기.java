class Solution {
    public String solution(String str) {
        String[] split = str.split("");
		if (!split[0].equals("0")) {
			return str;
		}

		StringBuilder answer = new StringBuilder();
		int idx = 0;
		for (int i = 0; i < split.length - 1; i++) {
			if (split[i].equals("0") && !split[i].equals(split[i + 1])) {
				idx = i + 1;
				break;
			}
		}

		for (int i = idx; i < split.length; i++) {
			answer.append(split[i]);
		}

		return answer.toString();
    }
}