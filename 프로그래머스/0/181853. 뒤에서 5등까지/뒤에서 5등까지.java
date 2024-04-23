import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        num_list = Arrays.copyOfRange(num_list, 0, 5);
        
        return num_list;
    }
}