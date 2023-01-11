import java.util.ArrayList;
import java.util.StringTokenizer;
class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s, " ");
        ArrayList<Integer> list = new ArrayList<>();

        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        list.sort((o1, o2) -> o1 - o2);

        return list.get(0) + " " + list.get(list.size() - 1);
        
    }
}