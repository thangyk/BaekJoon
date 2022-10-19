import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger a = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            a = a.multiply(new BigInteger(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        BigInteger b = BigInteger.ONE;
        for (int i = 0; i < m; i++) {
            b = b.multiply(new BigInteger(st.nextToken()));
        }

        String gcd = a.gcd(b).toString();
        System.out.println(gcd.length() > 9 ? gcd.substring(gcd.length() - 9, gcd.length()) : gcd);
        br.close();
    }
}