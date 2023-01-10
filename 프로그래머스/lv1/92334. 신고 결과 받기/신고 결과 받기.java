import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] result = new int[id_list.length];

        Set<String> set = new HashSet<>();
        for (String s : report) {
            set.add(s);
        }

        Map<String, List<String>> map = new HashMap<>();
        for (String s : set) {
            int delim = s.indexOf(" ");
            String user1 = s.substring(0, delim);
            String user2 = s.substring(delim + 1);

            List<String> list = map.getOrDefault(user2, null);
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(user1);
            map.put(user2, list);
        }

        Map<String, Integer> resultMap = new HashMap<>();
        for (List<String> list : map.values()) {
            if (list.size() >= k) {
                for (String user1 : list) {
                    resultMap.put(user1, resultMap.getOrDefault(user1, 0) + 1);
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = resultMap.getOrDefault(id_list[i], 0);
        }

        return result;
    }
}