class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;

        for (long i = 1; i <= count; i++) {
            sum += (price * i);
        }
        answer = money - sum;
        if (sum < money) {
            return 0;
        }

        return answer * -1;
    }
}