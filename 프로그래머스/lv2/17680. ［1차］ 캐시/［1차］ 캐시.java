import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        Queue<String> queue = new LinkedList<>();

        int runTime = 0;
        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();
            if (queue.contains(city)) {
                queue.remove(city);
                queue.offer(city);
                runTime += 1;
            } else {
                if (queue.size() < cacheSize) {
                    queue.offer(city);
                } else {
                    queue.poll();
                    queue.offer(city);
                }
                runTime += 5;
            }
        }

        return runTime;
    }
}