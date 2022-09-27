import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int nk = n-k;

        int nFac = 1;

        for (int i = n; i >= 1; i--) {
            nFac *= i;
        }

        int kFac = 1;
        for (int i = k; i >= 1; i--) {
            kFac *= i;
        }

        int nkFac = 1;
        for (int i = nk; i >= 1; i--) {
            nkFac *= i;
        }

        int ans = nFac/((nkFac)*kFac);

        System.out.println(ans);

        br.close();

    }
}