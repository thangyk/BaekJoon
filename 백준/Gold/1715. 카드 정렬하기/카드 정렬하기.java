import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int card = Integer.parseInt(br.readLine());

            pq.add(card);
        }

        int ans = 0;
        if (n > 1) {
            while (!pq.isEmpty()) {
                int set1 = pq.poll();
                int set2 = pq.poll();

                int newSet = set1 + set2;
                ans += newSet;
                if (pq.isEmpty()) {
                    break;
                }
                pq.add(newSet);
            }
        } else {
            ans = 0;
        }

        System.out.println(ans);

        br.close();
    }
}
