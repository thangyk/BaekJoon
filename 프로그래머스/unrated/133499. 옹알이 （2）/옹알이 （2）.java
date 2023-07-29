class Solution {
    public int solution(String[] babbling) {
        int cnt = 0;
        
        for(String s : babbling) {
            s = s.replaceAll("ayaaya|yeye|woowoo|mama", " ");
            s = s.replaceAll("aya|ye|woo|ma", "");
            
            if(s.equals("")) {
                cnt++;
            }
        }
        
        return cnt;
    }
}