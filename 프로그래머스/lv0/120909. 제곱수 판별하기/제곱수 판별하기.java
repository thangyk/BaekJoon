class Solution {
    public int solution(int n) {
        int answer = 0;

        int[] arr = new int[1000001];
        for (int i = 1; i < arr.length; i++) {
            if (i * i == n) {
                return 1;
            } else {
                answer = 2;
            }
        }
        return answer;
    }
}