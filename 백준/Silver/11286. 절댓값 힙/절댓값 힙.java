import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);
            if (abs1 == abs2) {
                return o1 - o2;
            }
            return abs1 - abs2;
        });

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (pq.isEmpty() && num == 0) {
                sb.append("0\n");
            } else if (num == 0) {
                sb.append(pq.poll()).append('\n');
            } else {
                pq.add(num);
            }
        }

        System.out.println(sb);

        br.close();
    }
}