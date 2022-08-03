import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class forTask {
    int deadLine;
    int point;

    public forTask(int deadLine, int point) {
        this.deadLine = deadLine;
        this.point = point;
    }
}

public class Main {

    static int n, result, maxDay;
    static PriorityQueue<forTask> pq;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        pq = new PriorityQueue<>((o1, o2) -> {
            if (o1.point == o2.point) {
                return o1.deadLine - o2.deadLine;
            }
            return o2.point - o1.point;
        });

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int deadLine = Integer.parseInt(st.nextToken());
            int point = Integer.parseInt(st.nextToken());

            maxDay = Math.max(deadLine, maxDay);
            pq.add(new forTask(deadLine, point));
        }

        int[] day = new int[maxDay+1];
        while (!pq.isEmpty()) {
            forTask task = pq.poll();
            for (int i = task.deadLine; i > 0; i--) {
                if (day[i] == 0) {
                    day[i] = task.point;
                    break;
                }
            }
        }

        for (int i = 1; i < day.length; i++) {
            result += day[i];
        }
        System.out.println(result);

//        while (!pq.isEmpty()) {
//            forTask task = pq.poll();
//            System.out.println(task.deadLine + " " + task.point);
//        }

        br.close();
    }
}
