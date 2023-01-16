import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        if (score.length < m) {
            return 0;
        }

        Arrays.sort(score);
        int result = 0;

        for (int i = score.length - 1; i >= 0; i -= m) {
            if (i - (m - 1) < 0) {
                break;
            }
            result += score[i - (m - 1)] * m;
        }

        return result;
    }
}