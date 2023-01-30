class Solution {
    public int[] solution(int brown, int yellow) {
            int num = brown + yellow;
        for (int i = 1; i <= num; i++) {
            int x = i;
            int y = num / x;

            if ((x - 2) * (y - 2) == yellow) {
                return new int[]{y, x};
            }
        }

        return new int[]{0, 0};
    }
}