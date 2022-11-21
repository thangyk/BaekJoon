import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int[] times = {300, 60, 10};

        if (t % 10 != 0) {
            System.out.println(-1);
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times.length; i++) {
            if (t >= times[i]) {
                sb.append(t / times[i] + " ");
                t %= times[i];
            } else {
                sb.append(0 + " ");
            }
        }
        System.out.println(sb);
        br.close();
    }
}