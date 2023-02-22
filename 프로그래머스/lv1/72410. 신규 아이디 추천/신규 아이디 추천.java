class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();

        String str = "";
        for (int i = 0; i < new_id.length(); i++) {
            char c = new_id.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
                str += c;
            }
        }

        while (true) {
            if (str.contains("..")) {
                str = str.replace("..", ".");
            } else {
                break;
            }
        }

        if (str.startsWith(".")) {
            str = str.substring(1);
        }

        if (str.endsWith(".")) {
            str = str.substring(0, str.length() - 1);
        }

        if (str.equals("")) {
            str = "a";
        }

        if (str.length() > 15) {
            str = str.substring(0, 15);
            if (str.endsWith(".")) {
                str = str.substring(0, str.length() - 1);
            }
        }

        if (str.length() <= 2) {
            while (str.length() < 3) {
                str += str.charAt(str.length() - 1);
            }
        }

        return str;
    }
}