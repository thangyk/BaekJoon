class Solution {
    public int solution(String my_string) {
        char[] split = my_string.toCharArray();
        
        int answer = 0;
        for(int i = 0; i < split.length; i++) {
            if(split[i] - '0' > 0 && split[i] - '0'< 10) {
                    answer += split[i] - '0';
            }  
        }
        
        return answer;
    }
}