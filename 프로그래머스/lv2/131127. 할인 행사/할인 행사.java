import java.util.HashMap;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int result = 0;

        HashMap<String, Integer> myList = new HashMap<>();
        HashMap<String, Integer> martList = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            myList.put(want[i], number[i]);
        }

        int startDay = 1;
        while (discount.length - startDay >= 9) {
            martList.clear();

            for (int i = startDay; i < startDay + 10; i++) {
                martList.put(discount[i - 1], martList.getOrDefault(discount[i - 1], 0) + 1);
            }

            if (myList.equals(martList)) {
                result++;
            }

            startDay++;
        }

        return result;
    }
}