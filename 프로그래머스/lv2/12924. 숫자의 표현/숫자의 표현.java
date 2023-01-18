class Solution {
    public int solution(int n) {
        int result = 1;

        int i = 1;
        while (i < n/2 + 1) {

            int sum = 0;
            for (int j = i; j <= n / 2 + 1; j++) {
                sum += j;
                if (sum == n) {
                    result++;
                    break;
                }
                
                if (sum > n) {
                    break;
                }
            }
            i++;
        }

        return result;
    }
}