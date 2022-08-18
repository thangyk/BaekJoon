import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int p1 = 0;
        int p2 = 0;

        int result = Integer.MAX_VALUE;
        while (p2 < N) {
            int diff = arr[p2] - arr[p1];

            if (diff < M) {
                p2++;
                continue;
            }

            if (diff >= M) {
                result = Math.min(result, diff);
                p1++;
                if (result == M) {
                    break;
                }
            }

        }

        System.out.println(result);

        br.close();
    }
}