import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        int cnt = 0;
        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            for (int j = 0; j < arr.length; j++) {
                if (find(arr[j], input)) {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
        br.close();
    }

    public static boolean find(String str, String input) {
        if (str.startsWith(input)) {
            return true;
        } else {
            return false;
        }
    }
}