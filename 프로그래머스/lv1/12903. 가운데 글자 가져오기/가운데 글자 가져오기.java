class Solution {
    public String solution(String s) {
        if (s.length() % 2 == 0) {
            int leftIdx = s.length() / 2 - 1;
            int rightIdx = s.length() / 2;
            return s.substring(leftIdx, rightIdx + 1);
        } else {
            int middleIdx = s.length() / 2;
            return s.substring(middleIdx, middleIdx + 1);
        }
    }
}