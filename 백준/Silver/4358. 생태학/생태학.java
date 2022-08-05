import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {

        TreeMap<String, Double> map = new TreeMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        double cnt = 0;
        while (true) {
            String type = br.readLine();
            if (type == null || type.equals("")) {
                break;
            }
            cnt++;
            map.put(type, map.getOrDefault(type, Double.valueOf(0)) + 1);
        }

        for (Map.Entry<String, Double> item : map.entrySet()) {
            sb.append(item.getKey() + " ");
            sb.append(String.format("%.4f", (item.getValue()/cnt)*100)+"\n");
        }

        System.out.println(sb);


    }
}
