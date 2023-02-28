import java.util.Arrays;
class Solution {
    public int[] solution(int[] prices) {
        int[] result = new int[prices.length];
        Arrays.fill(result, 1);

        for (int i = 0; i < result.length - 1; i++) {

            for (int j = i + 1; j < result.length - 1; j++) {
                if (prices[i] > prices[j]) {
                    break;
                }
                result[i]++;
            }
        }

        result[result.length - 1] = 0;

        return result;
    }
}