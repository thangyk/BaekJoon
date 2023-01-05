import java.util.Arrays;
class Solution {
    public long solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);

        long ans = arr[arr.length - 1] - 48;
        for (int i = arr.length - 2; i >= 0; i--) {
            ans = ans * 10 + arr[i] - 48;
        }

        return ans;
    }
}