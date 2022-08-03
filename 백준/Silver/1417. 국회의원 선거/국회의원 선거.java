import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            return o2 - o1;
        });

        int dasom = Integer.parseInt(br.readLine());
        final int oriDasom = dasom;

        for (int i = 0; i < n - 1; i++) {
            int c = Integer.parseInt(br.readLine());
            pq.offer(c);
        }

        if (pq.isEmpty()) {
            System.out.println(0);
            return;
        }

        while (pq.peek() >= dasom) {
            int cNum = pq.poll();
            pq.add(--cNum);
            dasom++;
        }

        System.out.println(dasom - oriDasom);

        br.close();
    }
}
