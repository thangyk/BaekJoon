import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int[] newElements = new int[elements.length * 2]; 
        
        for(int i = 1; i <= elements.length; i++) {
            for(int j = 0; j < elements.length; j++) {
                newElements[j] = newElements[j+elements.length] = elements[j];
                set.add(Arrays.stream(newElements, j, j+i).sum());
            }
        }
        
        return set.size();
    }
}