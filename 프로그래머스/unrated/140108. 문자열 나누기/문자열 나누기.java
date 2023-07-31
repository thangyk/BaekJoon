class Solution {
    public int solution(String s) {
        int answer = 0;
        
        while(s.length() > 0) {
            char c = s.charAt(0);
            
            int cnt1 = 1;
            int cnt2 = 0;
            
            for(int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    cnt1++;
                } else {
                    cnt2++;
                }
                
                if(cnt1 == cnt2) {
                    break;
                }
            }
            answer++;
            s = s.substring(cnt1 + cnt2);
            
        }
        
        return answer;
    }
}