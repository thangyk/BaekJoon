import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        Queue queue = new LinkedList();
        ArrayList<Integer> list = new ArrayList();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        IntStream.range(1, n + 1).forEach(x -> queue.add(x));

        int cnt = 0;
        while (!queue.isEmpty()) {
            int data = (int) queue.remove();
            cnt++;
            if (cnt % k == 0) {
                list.add(data);
            } else {
                queue.add(data);
            }
        }

        bw.write("<");
        for (int i = 0; i < list.size()-1; i++) {
            bw.write(list.get(i)+ ", ");
        }
        bw.write(list.get(list.size()-1) + ">\n");

        bw.flush();
        br.close();
        bw.close();

    }
}
