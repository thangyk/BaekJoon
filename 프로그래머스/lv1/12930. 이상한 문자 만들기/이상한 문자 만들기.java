import java.util.Locale;
class Solution {
    public String solution(String s) {
        String str = "";

        if (s.length() == 1) {
            return s.toUpperCase(Locale.ROOT);
        }

        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (idx % 2 == 0) {
                    str += String.valueOf(s.charAt(i)).toUpperCase(Locale.ROOT);
                } else {
                    str += String.valueOf(s.charAt(i)).toLowerCase(Locale.ROOT);
                }
                idx++;
            } else {
                idx = 0;
                str += s.charAt(i);
            }
        }

        return str;
    }
}