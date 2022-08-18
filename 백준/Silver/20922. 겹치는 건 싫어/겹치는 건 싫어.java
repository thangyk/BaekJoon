import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // 수열의 길이
        int K = Integer.parseInt(st.nextToken());   // 같은 정수의 개수

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int p1 = 0;
        int p2 = 0;
        int len = 0;
        int[] cnt = new int[100001];
        while (p2 < N) {

            if (cnt[arr[p2]] < K) {
                cnt[arr[p2]]++;
                p2++;
            } else if (cnt[arr[p2]] == K) {
                cnt[arr[p1]]--;
                p1++;
            }

            len = Math.max(len, p2 - p1);
        }

        System.out.println(len);

        br.close();
    }
}