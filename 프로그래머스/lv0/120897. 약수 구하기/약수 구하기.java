class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        answer = new int[cnt];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[idx++] = i;
            }
        }
        return answer;
    }
}