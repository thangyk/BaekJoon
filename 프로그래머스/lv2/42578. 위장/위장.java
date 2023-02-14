import java.util.HashMap;
import java.util.Map;
class Solution {
    public int solution(String[][] clothes) {
        int result = clothes.length;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            String clothe = clothes[i][1];
            map.put(clothe, map.getOrDefault(clothe, 0) + 1);
        }

        if (map.keySet().size() == 1) {
            return result;
        }

        int cnt = 1;
        for (String s : map.keySet()) {
            cnt *= map.get(s) + 1;
        }

        result = cnt - 1;

        return result;
    }
}