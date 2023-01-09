import java.util.HashSet;
import java.util.Set;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] ans = new int[2];
        Set<Integer> set = new HashSet<>();

        int zero = 0;

        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                zero++;
                continue;
            }
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]) {
                    set.add(lottos[i]);
                    break;
                }
            }
        }

        switch (set.size() + zero) {
            case 6:
                ans[0] = 1;
                break;
            case 5:
                ans[0] = 2;
                break;
            case 4:
                ans[0] = 3;
                break;
            case 3:
                ans[0] = 4;
                break;
            case 2:
                ans[0] = 5;
                break;
            default:
                ans[0] = 6;
                break;
        }

        switch (set.size()) {
            case 6:
                ans[1] = 1;
                break;
            case 5:
                ans[1] = 2;
                break;
            case 4:
                ans[1] = 3;
                break;
            case 3:
                ans[1] = 4;
                break;
            case 2:
                ans[1] = 5;
                break;
            default:
                ans[1] = 6;
                break;
        }

        return ans;
    }
}