class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i = 0; i < answer.length; i++) {
            int num = 10000001;
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
                if(arr[j] > queries[i][2] && arr[j] < num) {
                    num = arr[j];
                }
            }
            
            if(num == 10000001) {
                answer[i] = -1;
            } else {
                answer[i] = num;
            }
        }
        
        return answer;
    }
}