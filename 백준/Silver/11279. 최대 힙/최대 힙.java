import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static PriorityQueue<Integer> maxHeap;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());


        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (maxHeap.isEmpty() && x == 0) {
                sb.append("0\n");
            } else if (x == 0) {
                sb.append(maxHeap.poll() + "\n");
            } else {
                maxHeap.offer(x);
            }
        }

        System.out.println(sb);
        br.close();
    }
}
