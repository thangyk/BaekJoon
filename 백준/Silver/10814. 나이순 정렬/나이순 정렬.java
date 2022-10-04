import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder[] arr = new StringBuilder[201];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new StringBuilder();
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            arr[age].append(age + " " + name + "\n");
        }

        StringBuilder sb = new StringBuilder();
        for (StringBuilder item : arr) {
            sb.append(item);
        }

        System.out.println(sb);

        br.close();
    }
}