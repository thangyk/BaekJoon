class Solution {
    public int solution(int a, int b, int n) {
        int sum = 0;

        while (n >= a) {
            int newCoke = (n / a) * b;
            sum += newCoke;
            int r = n % a;
            n = newCoke + r;
        }
        return sum;
    }
}