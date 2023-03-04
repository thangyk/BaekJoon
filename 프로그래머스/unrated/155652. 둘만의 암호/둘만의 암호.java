class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            for (int j = 0; j < index; j++) {
                do {
                    c++;
                    if (c > 'z') {
                        c -= 26;
                    }
                } while (skip.contains(String.valueOf(c)));
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