import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    // 2776번
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        int note1;
        int note2;

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < n; j++) {
                note1 = Integer.parseInt(st.nextToken());
                set.add(note1);
            }

            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                note2 = Integer.parseInt(st.nextToken());
                if (set.contains(note2)) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            }

        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}