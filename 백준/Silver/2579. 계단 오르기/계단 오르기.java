import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size + 1];
        int[] dp = new int[size + 1];

        for (int i = 1; i <= size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = arr[1];

        if (size > 1) {
            dp[2] = arr[1] + arr[2];
        }

        for (int i = 3; i <= size; i++) {
            dp[i] = Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]);
            dp[i] = Math.max(dp[i], arr[i] + arr[i - 2]);
        }

        System.out.println(dp[size]);

        br.close();
    }
}