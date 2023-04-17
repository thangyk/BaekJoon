class Solution {
    public int solution(int order) {
        int result = 0;
		while (order > 0) {
			int r = order % 10;

			if (r == 3 || r == 6 || r == 9) {
				result++;
			}
			order /= 10;
		}
		
		return result;
    }
}