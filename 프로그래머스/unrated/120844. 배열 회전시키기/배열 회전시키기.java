class Solution {
    public int[] solution(int[] numbers, String direction) {
        int s = numbers[0];
        int e = numbers[numbers.length - 1];
        
        if(direction.equals("right")) {
            for(int i = numbers.length - 1; i > 0; i--) {
                numbers[i] = numbers[i - 1];
            }
            numbers[0] = e;
        } else {
            for(int i = 0 ; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[numbers.length - 1] = s;
        }
        
        
        return numbers;
    }
}