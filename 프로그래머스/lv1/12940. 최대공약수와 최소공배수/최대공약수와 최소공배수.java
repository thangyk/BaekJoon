class Solution {
    public int[] solution(int n, int m) {
        int[] arr = new int[2];

        if (n > m) {
            int tmp = n;
            n = m;
            m = tmp;
        }

        if (m % n == 0) {
            arr[0] = n;
            arr[1] = m;
        } else {
            for (int i = 1; i < m; i++) {
                if (n % i == 0 && m % i == 0) {
                    arr[0] = i;
                }
            }
            arr[1] = n * m / arr[0];
        }
        return arr;
    }
}