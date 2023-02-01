class Solution {
    public int solution(String s) {
        String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        String result = "";
        while (s.length() > 0) {

            for (int i = 0; i < nums.length; i++) {
                if (s.startsWith(nums[i])) {
                    result += i;
                    s = s.substring(nums[i].length());
                    break;
                }
            }

            if (s.length() == 0) {
                break;
            }
            
            char c = s.charAt(0);
            if (c >= 48 && c <= 57) {
                result += c;
                s = s.substring(1);
            }

        }

        return Integer.parseInt(result);
    }
}