class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int len = my_string.length();
        for(int i = 0; i < len / m; i++) {
            answer += my_string.charAt(c - 1);
            my_string = my_string.substring(m);
        }
        return answer;
    }
}