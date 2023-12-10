import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int solution(int[] arr, int n) {
        int answer = 0;
        int diff = 101;
        
        Integer[] array = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(array, Collections.reverseOrder());
        for(int i = 0 ; i < array.length ; i++) {
            int num = Math.abs(array[i] - n);
            if(num <= diff) {
                answer = array[i];
                diff = num;
            }
        }
        
        return answer;
    }
}