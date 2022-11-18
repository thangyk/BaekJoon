import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        int[] B = new int[M];
        int[] result = new int[N + M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        int idx = 0;
        int p1 = 0;
        int p2 = 0;
        while (p1 < N && p2 < M) {
            if (A[p1] < B[p2]) {
                result[idx++] = A[p1++];
            } else {
                result[idx++] = B[p2++];
            }
        }

        while (p1 < N) {
            result[idx++] = A[p1++];
        }

        while (p2 < M) {
            result[idx++] = B[p2++];
        }

        for (int i : result) {
            bw.write(String.valueOf(i));
            bw.write(" ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}