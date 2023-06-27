class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("x");
        int cnt = 0;
        for(String s : myString.split("")) {
            if(s.equals("x")) {
                cnt++;
            }
        }
        int[] result = new int[cnt+1];
        
        for(int i = 0; i < arr.length; i++) {
            result[i] = arr[i].length();
        }
        
        return result;
    }
}