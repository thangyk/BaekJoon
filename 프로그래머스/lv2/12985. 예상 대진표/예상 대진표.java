class Solution {
    public int solution(int n, int a, int b) {
        int cnt = 0;

        if (a / 2 != b / 2 && Math.abs(a - b) == 1) {
            return 1;
        }

        while (true) {
            if (a / 2 != b / 2 && Math.abs(a - b) == 1) {
                cnt++;
                break;
            }

            if (a % 2 == 0) {
                a /= 2;
            } else {
                a = a / 2 + 1;
            }

            if (b % 2 == 0) {
                b /= 2;
            } else {
                b = b / 2 + 1;
            }

            cnt++;
        }

        return cnt;
    }
}