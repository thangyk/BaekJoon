class Solution {
    public int[] solution(String s) {
        int idx = 1;
        int[] arr = new int[s.length()];
        arr[0] = -1;
        while (idx < s.length()) {
            char c = s.charAt(idx);

            for (int i = 0; i < idx; i++) {
                if (s.charAt(i) == c) {
                    int diff = idx - i;
                    arr[idx] = diff;
                }
            }
            if (arr[idx] == 0) {
                arr[idx] = -1;
            }
            idx++;
        }
        return arr;
    }
}