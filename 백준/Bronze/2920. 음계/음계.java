import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[8];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        String ans = "descending";
        for (int i = 0; i < 7; i++) {
            if (Math.abs(arr[i] - arr[i+1]) != 1) {
                ans = "mixed";
                break;
            }

            if (arr[i] + 1 == arr[i + 1]) {
                ans = "ascending";
            }
        }

        System.out.println(ans);
    }
}