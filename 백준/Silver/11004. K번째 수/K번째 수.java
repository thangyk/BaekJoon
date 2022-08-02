import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());

            minHeap.add(a);
        }

        int idx = 0;
        int num = 0;
        while (!minHeap.isEmpty()) {
            ++idx;
            num = minHeap.poll();

            if (idx == k) {
                break;
            }
        }
        System.out.println(num);


        br.close();
    }
}
