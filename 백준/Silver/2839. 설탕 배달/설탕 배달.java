import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n < 3 || n == 4 || n == 7) {
            System.out.println(-1);
            return;
        }

        int cnt = 0;
        while (true) {
            if (n % 5 == 0) {
                System.out.println(n / 5 + cnt);
                break;
            }
            n -= 3;
            cnt++;
        }

        br.close();
    }
}