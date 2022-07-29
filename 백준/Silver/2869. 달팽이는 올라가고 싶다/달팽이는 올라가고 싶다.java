import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static StringTokenizer st;
    static int dayCnt;
    static int up;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());

        // 낮에 올라가는 높이
        final int A = Integer.parseInt(st.nextToken());
        // 밤에 떨어지는 높이
        final int B = Integer.parseInt(st.nextToken());
        // 올라가려는 나무의 높이
        final int V = Integer.parseInt(st.nextToken());

        // 데이 카운트
        dayCnt = 0;

        // 하루에 올라가는 높이
        up = A - B;
        int offset = V - A;
        if (offset == 0) {
            dayCnt = 0;
        } else if (up > offset) {
            dayCnt = 1;
        } else {
            dayCnt = (int) Math.ceil((double) offset / up);
        }
        
        System.out.println(dayCnt+1);

        br.close();
    }
}
