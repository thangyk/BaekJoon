import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int s = -1;
        int e = -1;
        boolean isCheck = false;
        
        for(int i = 0 ; i < arr.length; i++) {
            if(arr[i] == 2) {
                if(!isCheck) {
                    isCheck = true;
                    s = i;
                }
                
                e = i;
            }
        }
        
        if(!isCheck) {
            return new int[]{-1};
        }
        
        int[] answer = new int[e - s + 1];
        System.arraycopy(arr, s, answer, 0, e - s + 1);

        return answer;
    }
}