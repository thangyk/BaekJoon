import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    // 11652번
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashMap<Long, Integer> map = new HashMap<>();

        int max = 0;
        long result = 0;

        for (int i = 0; i < n; i++) {
            long cardNum = Long.parseLong(br.readLine());

            if (map.containsKey(cardNum)) {
                map.put(cardNum, map.get(cardNum) + 1);
            } else {
                map.put(cardNum, 1);
            }

            if (map.get(cardNum) > max) {
                max = map.get(cardNum);
                result = cardNum;
            } else if (map.get(cardNum) == max) {
                result = Math.min(result, cardNum);
            }

        }

        System.out.println(result);

        br.close();
    }
}