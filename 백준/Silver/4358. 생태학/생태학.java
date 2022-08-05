import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static Map<String, Integer> map = new HashMap<>();
    static double cnt;

    public static void main(String[] args) throws IOException {

        while (true) {
            String type = br.readLine();
            if (type == null || type.equals("")) {
                break;
            }
            cnt++;
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        String[] tree = map.keySet().toArray(new String[0]);
        Arrays.sort(tree);

        for (int i = 0; i < tree.length; i++) {
            sb.append(tree[i] + " ");
            sb.append(String.format("%.4f", (map.get(tree[i]) / cnt) * 100) + "\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();

    }
}
