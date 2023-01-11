class Solution {
    public int solution(int n) {
int result = 0;

        for (int i = 2; i < n + 1; i++) {
            if (isPrime(i)) {
                result++;
            }
        }
        return result;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}