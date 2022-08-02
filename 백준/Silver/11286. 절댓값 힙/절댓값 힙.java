import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    static BufferedReader br;
    static PriorityQueue<Integer> heap;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        heap = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);
            if (abs1 == abs2) {
                return o1 - o2;
            }
            return abs1 - abs2;
        });

        sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (heap.isEmpty() && x == 0) {
                sb.append("0\n");
            } else if (x == 0) {
                sb.append(heap.poll() + "\n");
            } else {
                heap.add(x);
            }

        }

        System.out.println(sb);
        br.close();
    }
}
