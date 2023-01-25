class Solution {
    public int[] solution(String s) {
        int[] result = new int[2];

        while (s.length() > 1) {

            int cnt = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    cnt++;
                } else {
                    result[1]++;
                }
            }
            s = Integer.toBinaryString(cnt);
            result[0]++;

        }

        return result;
    }
}