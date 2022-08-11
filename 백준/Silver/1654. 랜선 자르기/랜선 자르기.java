import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 오영식이 이미 가지고 있는 랜선의 개수 K
        int K = Integer.parseInt(st.nextToken());

        // 필요한 랜선의 개수 N
        int N = Integer.parseInt(st.nextToken());

        long left = 1;
        long right = 0;

        int[] arr = new int[K];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            right = Math.max(right, arr[i]);
        }

        while (left <= right) {
            long mid = left + (right - left) / 2;

            long cnt = 0;

            for (int i : arr) {
                cnt += i / mid;
            }

            if (cnt >= N) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        System.out.println(right);

        br.close();
    }
}