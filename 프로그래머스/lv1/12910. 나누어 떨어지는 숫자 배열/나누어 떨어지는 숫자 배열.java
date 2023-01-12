import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }

        if (list.size() == 0) {
            return new int[]{-1};
        }

        return list.stream().mapToInt(i -> i).sorted().toArray();
    }
}