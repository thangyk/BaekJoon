import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Math.abs(Integer.parseInt(st.nextToken())-s);
        }
        Arrays.sort(arr);

        int d = 0;
        if (n != 1) {
            int gcd = arr[0];
            for (int i = 1; i < n; i++) {
                gcd = getGCD(gcd, arr[i] - arr[i - 1]);
            }
            d = gcd;
        } else {
            d = arr[0];
        }
        System.out.println(d);
        br.close();
    }

    public static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }
}