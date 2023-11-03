class Solution {
    static int answer;
    public int solution(int[] numbers, int target) {
        answer = 0;

		dfs(numbers, 1, numbers[0], target);
		return answer;
    }
    
    static void dfs(int[] numbers, int idx, int result, int target) {
		if (idx == numbers.length) {
			if (Math.abs(result) == target) {
				answer++;
			}
			return;
		}

		dfs(numbers, idx + 1, result + numbers[idx], target);
		dfs(numbers, idx + 1, result - numbers[idx], target);
	}
}