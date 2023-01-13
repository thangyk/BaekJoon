class Solution {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();

        String ans = "";
        for (char c : arr) {
            if (c != ' ') {
                if (c >= 'a' && c <= 'z') {
                    ans += (char) ('a' + (c + n - 'a') % 26);
                } else {
                    ans += (char) ('A' + (c + n - 'A') % 26);
                }
            } else {
                ans += " ";
            }
        }
        return ans;
    }
}