import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> pq = new PriorityQueue<>((o1, o2) -> o1-o2);

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > 0) {
                pq.add(num);
            } else {
                if (pq.isEmpty()) {
                    sb.append("0\n");
                } else {
                    sb.append(pq.remove()).append('\n');
                }
            }
        }

        System.out.println(sb);

        br.close();
    }
}