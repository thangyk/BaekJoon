import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int solution(int[][] lines) {
        List<int[]> events = new ArrayList<>();

        for (int i = 0; i < lines.length; i++) {
            int start = lines[i][0];
            int end = lines[i][1];
            events.add(new int[]{start, 1});
            events.add(new int[]{end, -1});
        }

        Collections.sort(events, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return b[1] - a[1];
            }
        });

        int count = 0;
        int overlapLength = 0;

        for (int i = 0; i < events.size(); i++) {
            count += events.get(i)[1];
            if (count >= 2) {
                if (i + 1 < events.size()) {
                    overlapLength += events.get(i + 1)[0] - events.get(i)[0];
                }
            }
        }

        return overlapLength;
    }
}
