class Solution {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];

        int idx = 0;
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[idx++] = String.valueOf(n).charAt(i) - '0';
        }

        return answer;
    }
}