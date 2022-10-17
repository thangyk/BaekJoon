import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean[] prime = new boolean[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        prime[0] = prime[1] = true;
        StringBuilder sb = new StringBuilder();

        for (int i = 2; i <= 1000000; i++) {
            if (!prime[i]) {
                for (int j = i + i; j <= 1000000; j += i) {
                    prime[j] = true;
                }
            }
        }
        while (t-- > 0) {
            int tmp = Integer.parseInt(br.readLine());
            int cnt = 0;
            for (int i = 2; i <= tmp / 2; i++) {
                if (!prime[i] && !prime[tmp - i]) {
                    cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }
}