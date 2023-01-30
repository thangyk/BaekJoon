import java.util.HashSet;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] result = new int[2];

        HashSet<String> set = new HashSet<>();
        set.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            int a = (i + 1) % n == 0 ? n : (i + 1) % n;
            int b = (i / n) + 1;

            if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                result[0] = a;
                result[1] = b;
                return result;
            }

            if (set.contains(words[i])) {
                result[0] = a;
                result[1] = b;
                return result;
            } else {
                set.add(words[i]);
            }
        }

        if (set.size() == words.length) {
            return new int[]{0, 0};
        }

        return result;
    }
}