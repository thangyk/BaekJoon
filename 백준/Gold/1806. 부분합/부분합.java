import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int len = 100000;
    static int total, p1, p2 = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            arr[i] = n;
            total += n;
        }

        if (total < S) {
            len = 0;
            System.out.println(len);
            return;
        }

        int sum = 0;
        while (p1 <= p2 && p2 <= N) {

            if (sum >= S) {
                len = Math.min(len, p2 - p1);
                sum -= arr[p1++];
            } else {
                sum += arr[p2++];
            }

        }

        bw.write(String.valueOf(len));

        bw.flush();
        bw.close();
        br.close();
    }
}