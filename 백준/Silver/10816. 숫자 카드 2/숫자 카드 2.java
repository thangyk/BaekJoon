import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        boolean[] checkNum = new boolean[20000001];
        int[] cardNum = new int[20000001];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            checkNum[num + 10000000] = true;
            cardNum[num + 10000000] += 1;
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (checkNum[num + 10000000] == true) {
                sb.append(cardNum[num + 10000000] + " ");
            } else {
                sb.append(0 + " ");
            }
        }

        System.out.println(sb);

        br.close();
    }
}