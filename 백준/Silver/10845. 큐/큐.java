import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static int checkPop(Deque queue) {
        if (queue.isEmpty()) {
            return -1;
        }

        return (int) queue.remove();
    }

    public static int checkEmpty(Deque queue) {
        if (queue.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int printFront(Deque queue) {
        if (queue.isEmpty()) {
            return -1;
        } else {
            return queue.peekFirst().hashCode();
        }
    }

    public static int printBack(Deque queue) {
        if (queue.isEmpty()) {
            return -1;
        } else {
            return queue.peekLast().hashCode();
        }
    }

    public static void main(String[] args) throws IOException {
        Deque queue = new LinkedList();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push":
                    queue.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    bw.write(checkPop(queue) + "\n");
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    bw.write(checkEmpty(queue) + "\n");
                    break;
                case "front":
                    bw.write(printFront(queue) + "\n");
                    break;
                case "back":
                    bw.write(printBack(queue) + "\n");
                    break;
            }
        }


        bw.flush();
        br.close();
        bw.close();

    }
}