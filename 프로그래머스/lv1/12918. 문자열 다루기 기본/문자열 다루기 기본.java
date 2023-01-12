class Solution {
    public boolean solution(String s) {
        if (!(s.length() == 4 || s.length() == 6)) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char[] arr = s.toCharArray();

            if (arr[i] >= 48 && arr[i] <= 57) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }
}