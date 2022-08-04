import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();


        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = a.length()-1; i >= 0; i--) {
            sb1.append(a.charAt(i));
        }

        for (int i = b.length()-1; i >= 0; i--) {
            sb2.append(b.charAt(i));
        }

        if (Integer.parseInt(sb1.toString()) > Integer.parseInt(sb2.toString())) {
            System.out.println(sb1);
        } else {
            System.out.println(sb2);
        }

        br.close();
    }
}
