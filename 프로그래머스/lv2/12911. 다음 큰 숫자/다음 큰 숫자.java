class Solution {
    public int solution(int n) {
        String binary1 = Integer.toBinaryString(n);
        for (int i = n + 1; i <= 1000000; i++) {
            String binary2 = Integer.toBinaryString(i);

            if (isOneCnt(binary1) == isOneCnt(binary2)) {
                return i;
            }
        }

        return -1;
    }

    public static int isOneCnt(String binary) {
        char[] arr = binary.toCharArray();

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                cnt++;
            }
        }
        return cnt;
    }
}