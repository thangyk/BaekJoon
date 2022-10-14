import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = "";
        StringBuilder sb = new StringBuilder();
        while (!line.equals("0")) {
            line = br.readLine();
            int cnt = 0;

            for (int i = Integer.parseInt(line) + 1; i <= 2 * Integer.parseInt(line); i++) {
                if (isPrime(i)) {
                    cnt++;
                }
            }
            if (cnt != 0) {
                sb.append(cnt).append('\n');
            }
        }
        System.out.println(sb);

        br.close();
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}