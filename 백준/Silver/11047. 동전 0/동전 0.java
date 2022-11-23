import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] coins = new int[n];
        for (int i = n-1; i >= 0; i--) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (k < coins[i]) {
                continue;
            }
            int q = k / coins[i];
            cnt += q;
            k -= q * coins[i];
            if (k == 0) {
                break;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}