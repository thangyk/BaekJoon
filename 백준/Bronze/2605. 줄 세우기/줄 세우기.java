import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        ArrayList<Integer> list = new ArrayList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            int select = Integer.parseInt(st.nextToken());

            list.add(i - select - 1, i);
        }

        for (int item : list) {
            bw.write(item + " ");
        }

        bw.flush();
        br.close();
        bw.close();

    }
}
