import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }

            int left = 1;
            int right = n - 1;
            while (left <= right) {
                if (isOddPrime(left) && isOddPrime(right)) {
                    if (n == left + right) {
                        sb.append(String.format("%d = %d + %d", n, left, right)).append('\n');
                        break;
                    }
                } else {
                    left++;
                    right--;
                }
            }
        }

        System.out.println(sb);

        br.close();
    }

    public static boolean isOddPrime(int n) {
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