class Solution {
    public int solution(int n, int m, int[] section) {
        int cnt = 1;
		int now = section[0] + m;
		for (int i = 1; i < section.length; i++) {
			if (now > section[i]) {
				continue;
			}
			now = section[i] + m;
			cnt++;
		}

		return cnt;
    }
}