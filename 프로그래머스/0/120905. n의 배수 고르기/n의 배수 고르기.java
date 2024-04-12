import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(int n, int[] numList) {
        List<Integer> list = new ArrayList<>();

		int size = 0;
		for (int i = 0; i < numList.length; i++) {
			if (numList[i] % n == 0) {
				size++;
				list.add(numList[i]);
			}
		}

		int[] answer = new int[size];
		for (int i = 0; i < size; i++) {
			answer[i] = list.get(i);
		}

		return answer;
    }
}