class Solution {
    public int solution(int num, int k) {
        int answer = -1;
		String str = String.valueOf(num);

		for (int i = 0; i < str.length(); i++) {
			if (str.contains(String.valueOf(k))) {
				answer = str.indexOf(String.valueOf(k)) + 1;
				break;
			}
		}

		return answer;
    }
}