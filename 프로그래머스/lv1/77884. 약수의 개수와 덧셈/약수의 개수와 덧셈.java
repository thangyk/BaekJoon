class Solution {
    public int solution(int left, int right) {
        int sum = 0;

        for (int i = left; i <= right; i++) {
            if (numCnt(i) % 2 == 0) {
                sum += i;
            } else {
                sum -= i;
            }
        }

        return sum;
    }

    public static int numCnt(int n) {
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }

        return cnt;
    }
}