import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] Arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = Integer.parseInt(st.nextToken());
        }

        int p1 = 0;
        int p2 = 0;
        int cnt = 0;

        while (p1 < N && p2 < N) {
            int sum = 0;

            for (int i = p1; i <= p2; i++) {
                sum += Arr[i];
            }

            if (sum == M) {
                p1++;
                p2++;
                cnt++;
                continue;
            }

            if (sum < M) {
                p2++;
            } else {
                p1++;
            }

        }

        bw.write(String.valueOf(cnt));


        bw.flush();
        bw.close();
        br.close();
    }
}