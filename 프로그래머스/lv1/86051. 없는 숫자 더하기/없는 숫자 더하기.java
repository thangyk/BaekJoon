class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }

        int numberSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numberSum += numbers[i];
        }

        return sum - numberSum;
    }
}