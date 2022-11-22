import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] coins = {25, 10, 5, 1};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int change = Integer.parseInt(br.readLine());

            for (int j = 0; j < coins.length; j++) {
                if (change >= coins[j]) {
                    int q = change / coins[j];
                    change %= coins[j];
                    sb.append(q + " ");
                } else {
                    sb.append(0 + " ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}