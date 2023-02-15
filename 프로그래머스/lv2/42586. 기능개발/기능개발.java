import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int progress = progresses[i];
            int speed = speeds[i];
            if ((100 - progress) % speed == 0) {
                queue.add((100 - progress) / speed);
            } else {
                queue.add((100 - progress) / speed + 1);
            }
        }

        int num = queue.poll();
        int cnt = 1;

        while (!queue.isEmpty()) {
            if (num >= queue.peek()) {
                cnt++;
                queue.poll();
            } else {
                list.add(cnt);
                cnt = 1;
                num = queue.poll();
            }
        }

        list.add(cnt);

        return list.stream().mapToInt(x -> x).toArray();
    }
}