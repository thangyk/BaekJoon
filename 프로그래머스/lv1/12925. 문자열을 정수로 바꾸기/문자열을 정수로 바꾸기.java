class Solution {
    public int solution(String s) {
        int ans = 0;

        if (s.charAt(0) == '-') {
            ans = Integer.parseInt(s.substring(1)) * -1;
        } else {
            ans = Integer.parseInt(s);
        }

        return ans;
    }
}