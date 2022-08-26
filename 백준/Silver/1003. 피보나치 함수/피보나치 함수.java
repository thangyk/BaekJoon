import java.io.*;

public class Main {

    static int n,a,b;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());
            fib(n);
            bw.write(a + " " + b + "\n");
            a = 0;
            b = 0;
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static void fib(int n) {

        int dp = 0;
        int tmp1 = 0;
        int tmp2 = 1;

        if (n == 0) {
            a++;
        } else if (n == 1) {
            b++;
        } else {
            for (int i = 2; i <= n; i++) {
                dp = tmp1 + tmp2;
                tmp1 = tmp2;
                tmp2 = dp;
            }
            a = tmp1;
            b = tmp2;
        }


    }

}