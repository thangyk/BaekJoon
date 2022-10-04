import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int[] arr = new int[n];
        int cnt = 0;
        int idx = 0;
        while (!queue.isEmpty()) {
            cnt++;

            if (cnt == k) {
                arr[idx++] = queue.remove();
                cnt = 0;
                continue;
            }

            int num = queue.remove();
            queue.offer(num);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < arr.length - 1; i++) {
            sb.append(arr[i] + ", ");
        }
        sb.append(arr[arr.length - 1] + ">");

        System.out.println(sb);

        br.close();
    }
}