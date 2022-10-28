import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static LinkedList<Integer> dq = new LinkedList<>();
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            dq.add(i);
        }

        int[] arr = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            if (check(arr[i])) {
                while (arr[i] != dq.peekFirst()) {
                    shiftLeft();
                }
            } else {
                while (arr[i] != dq.peekFirst()) {
                    shiftRight();
                }
            }
            dq.pollFirst();
        }

        System.out.println(cnt);

        br.close();
    }

    public static int shiftLeft() {
        int num = dq.pollFirst();
        dq.addLast(num);
        cnt++;
        return dq.peekFirst();
    }

    public static int shiftRight() {
        int num = dq.pollLast();
        dq.addFirst(num);
        cnt++;
        return dq.peekLast();
    }

    public static boolean check(int n) {
        for (int i = 0; i <= dq.size() / 2; i++) {
            if (dq.indexOf(n) <= i) {
                return true;
            }
        }
        return false;
    }
}