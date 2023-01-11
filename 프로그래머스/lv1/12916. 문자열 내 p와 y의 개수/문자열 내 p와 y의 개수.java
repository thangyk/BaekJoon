import java.util.Locale;
class Solution {
    boolean solution(String s) {
        s = s.toLowerCase(Locale.ROOT);

        int pCnt = 0;
        int yCnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'y') {
                yCnt++;
            } else if (s.charAt(i) == 'p') {
                pCnt++;
            }
        }
        
        return pCnt == yCnt ? true : false;
    }
}