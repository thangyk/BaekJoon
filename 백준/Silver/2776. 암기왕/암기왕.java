import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    // 2776번
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        int note1;
        int note2;

        for (int i = 0; i < T; i++) {
            Map<Integer, Integer> map = new HashMap();

            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                note1 = Integer.parseInt(st.nextToken());
                map.put(note1, note1);
            }

            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                note2 = Integer.parseInt(st.nextToken());
                if (map.containsKey(note2)) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            }

        }

        bw.flush();
        bw.close();
        br.close();
    }
}