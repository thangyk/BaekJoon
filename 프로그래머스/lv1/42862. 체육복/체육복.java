import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] isOk = new int[n + 1];
        Arrays.fill(isOk, 1);
        isOk[0] = -99;

        for (int i = 0; i < reserve.length; i++) {
            isOk[reserve[i]] = 2;
        }

        for (int i = 0; i < lost.length; i++) {
            isOk[lost[i]] -= 1;
        }

        if (isOk[1] == 2 && isOk[2] == 0) {
            isOk[1] = 1;
            isOk[2] = 1;
        }

        if (isOk[n] == 2 && isOk[n - 1] == 0) {
            isOk[n] = 1;
            isOk[n - 1] = 1;
        }

        for (int i = 2; i < isOk.length - 1; i++) {
            if (isOk[i] == 2 && isOk[i - 1] == 0) {
                isOk[i] = 1;
                isOk[i - 1] = 1;
            } else if (isOk[i] == 2 && isOk[i + 1] == 0) {
                isOk[i] = 1;
                isOk[i + 1] = 1;
            }
        }

        int cnt = 0;
        for (int i : isOk) {
            if (i == 0) {
                cnt++;
            }
        }
        return n - cnt;
    }
}