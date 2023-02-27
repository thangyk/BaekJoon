import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
class Solution {
    public int solution(int[] topping) {
        int result = 0;

        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : topping) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i = 0; i < topping.length; i++) {
            if (set.size() > map.size()) {
                return result;
            }
            int n = topping[i];

            set.add(n);
            map.put(n, map.get(n) - 1);
            if (map.get(n) == 0) {
                map.remove(n);
            }

            if (set.size() == map.size()) {
                result++;
            }

        }

        return result;
    }
}