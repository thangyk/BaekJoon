class Solution {
    public String solution(String s) {
        String[] arr = s.toLowerCase().split("");
        boolean flag = true;

        String result = "";
        for (String ss : arr) {
            result += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        return result;
    }
}