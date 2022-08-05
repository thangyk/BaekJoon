import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        Map<String, Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        double cnt = 0;
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
            sb.append(String.format("%.4f", (map.get(tree[i])/cnt)*100)+"\n");
        }

        System.out.println(sb);


    }
}
