import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String file = br.readLine();
            String extension = file.substring(file.indexOf(".") + 1);

            if (map.containsKey(extension)) {
                map.put(extension, map.get(extension) + 1);
            } else {
                map.put(extension, 1);
            }
        }

        Map<String, Integer> sortedMap = new TreeMap<>(map);

        for (Map.Entry<String, Integer> item : sortedMap.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }

        br.close();


    }
}