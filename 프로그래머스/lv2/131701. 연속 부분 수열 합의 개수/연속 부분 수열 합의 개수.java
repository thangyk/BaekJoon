import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
            int[] dp = new int[elements.length];
            for(int i = 1; i <= elements.length; i++){
                for(int j = 0; j < elements.length; j++){
                    dp[j] += elements[(i + j - 1) % elements.length];
                    set.add(dp[j]);
                }
            }
            return set.size();
    }
}