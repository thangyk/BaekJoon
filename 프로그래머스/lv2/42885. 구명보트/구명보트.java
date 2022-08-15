import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;

        // 구명보트는 최대 2명만 탈 수 있다. ( + 무게제한도 있음 )
        // 모든 사람을 구출하려면 구명보트는 몇번 사용해야 하는가

        // 1 <= people.length <= 50000
        // 40 <= people[i] <= 240
        // 40 <= limit <= 240

        Arrays.sort(people);

        int left = 0;
        for (int right = people.length - 1; left <= right; right--) {
            if (people[left] + people[right] <= limit) {
                left++;
            }
            answer++;
        }

        return answer;
    }
}