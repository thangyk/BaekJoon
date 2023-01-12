class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length() - 4;
        String result = "";
        for (int i = 0; i < len; i++) {
            result += "*";
        }

        return result + phone_number.substring(len);
    }
}