class Solution {
    public int solution(String t, String p) {
        int s = 0;
        int e = s + p.length() - 1;
        Long[] nums = new Long[t.length() - p.length() + 1];

        while (e < t.length()) {
            String str = t;

            nums[s] = Long.parseLong(str.substring(s, e + 1));
            s++;
            e++;
        }

        int cnt = 0;
        for (long num : nums) {
            if (num <= Long.parseLong(p)) {
                cnt++;
            }
        }

        return cnt;
    }
}