class Solution {
    public int[] solution(int s, int e) {
        int[] answer = new int[s - e + 1];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = s--;
        }
        
        return answer;
    }
}