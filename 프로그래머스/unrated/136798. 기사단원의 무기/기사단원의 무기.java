class Solution {
    public int solution(int number, int limit, int power) {
        int result = 0;

        for (int i = 1; i <= number; i++) {
            if (prime(i) > limit) {
                result += power;
            } else {
                result += prime(i);
            }
        }

        return result;
    }

    public static int prime(int n) {
        int cnt = 0;
        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i * i == n) {
                    cnt++;
                } else {
                    cnt += 2;
                }
            }
        }
        return cnt;
    }
}