import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] topSingers = new int[k];
        Arrays.fill(topSingers, Integer.MIN_VALUE);

        int[] result = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            Arrays.sort(topSingers);

            if (score[i] >= topSingers[0]) {
                topSingers[0] = score[i];
            }

            Arrays.sort(topSingers);
            if (i < k) {
                result[i] = topSingers[k - 1 - i];
            } else {
                result[i] = topSingers[0];
            }
        }

        return result;
    }
}