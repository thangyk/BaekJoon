class Solution {
    public int solution(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int sum;
            int a = nums[i];

            for (int j = i + 1; j < nums.length - 1; j++) {
                int b = nums[j];

                for (int k = j + 1; k < nums.length; k++) {
                    sum = a + b + nums[k];

                    if (isPrime(sum)) {
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}