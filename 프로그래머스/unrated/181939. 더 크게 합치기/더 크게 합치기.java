class Solution {
    public int solution(int a, int b) {
        return func(a,b) >= func(b,a) ? func(a,b) : func(b,a);
    }
    
    public static int func(int a, int b) {
        return Integer.parseInt(String.valueOf(a) + String.valueOf(b));
    }
}