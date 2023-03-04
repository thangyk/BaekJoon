class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            int cnt = 0;
            while (cnt < index) {
                c = (c == 'z' ? 'a' : (char) (c + 1));
                if (!skip.contains(String.valueOf(c))) {
                    cnt++;
                }
            }

            if (c > 'z') {
                str.append((char) (c - 26));
            } else {
                str.append(c);
            }
        }

        return str.toString();
    }
}