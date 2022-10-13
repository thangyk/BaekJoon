import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            int[] result = new int[3];
            result[0] = 10001;

            int left = 1;
            int right = num - 1;

            while (left <= right) {
                if (isPrime(left) && isPrime(right)) {
                    if (num == left + right) {
                        if (result[0] > right - left) {
                            result[0] = right - left;
                            result[1] = left;
                            result[2] = right;
                        }
                    }
                    left++;
                    right--;
                } else {
                    left++;
                    right--;
                }
            }
            sb.append(result[1]).append(' ').append(result[2]).append('\n');
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