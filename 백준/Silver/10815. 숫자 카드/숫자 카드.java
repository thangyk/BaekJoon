import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        boolean[] cardNum = new boolean[20000000];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cardNum[Integer.parseInt(st.nextToken()) + 10000000] = true;
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            if (cardNum[Integer.parseInt(st.nextToken()) + 10000000] == true) {
                sb.append(1 + " ");
            } else {
                sb.append(0 + " ");
            }
        }

        System.out.println(sb);

        br.close();
    }
}