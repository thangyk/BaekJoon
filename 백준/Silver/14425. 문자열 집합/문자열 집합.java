import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] sArr = new String[N];
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = br.readLine();
        }

        int cnt = 0;
        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            for (int j = 0; j < N; j++) {
                if (input.equals(sArr[j])) {
                    cnt++;
                    break;
                }

            }
        }
        System.out.println(cnt);

        br.close();

    }
}
