import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String input = br.readLine();

            String s = String.valueOf(input.charAt(0));
            String e = String.valueOf(input.charAt(input.length() - 1));

            sb.append(s + e).append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}