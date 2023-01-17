class Solution {
    public long solution(long n) {
        long num = Sqrt(n);

        return num != -1 ? num * num : num;
    }

    public static long Sqrt(long n) {
        for (long i = 1; i <= n; i++) {
            if (n % i == 0 && i * i == n) {
                return i + 1;
            }
        }

        return -1;
    }
}