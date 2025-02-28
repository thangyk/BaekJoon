class Solution {
    public int solution(String s) {
        boolean isMinus = false;

		if (s.startsWith("-")) {
			isMinus = true;
			s = s.substring(1);
		} else if (s.startsWith("+")) {
			s = s.substring(1);
		}

		int answer = Integer.parseInt(s);
		return isMinus ?  answer * -1 : answer;
    }
}