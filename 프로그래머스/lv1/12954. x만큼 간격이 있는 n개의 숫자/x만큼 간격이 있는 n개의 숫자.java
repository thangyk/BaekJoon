class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        long plusNum = x;
        for (int i = 0; i < answer.length; i++, plusNum += x) {
            answer[i] = plusNum;
        }

        return answer;
    }
}