class Solution {
    public int solution(int[] number) {
        int sum = 0;
        int tmp = 0;

        int cnt = 0;
        for (int i = 0; i < number.length - 2; i++) {
            tmp = number[i];

            for (int j = i + 1; j < number.length - 1; j++) {
                int a = number[j];

                for (int k = j + 1; k < number.length; k++) {
                    int b = number[k];

                    sum = a + b;
                    if (sum == -tmp) {
                        cnt++;
                    }
                }
            }
        }
        
        return cnt;
    }
}