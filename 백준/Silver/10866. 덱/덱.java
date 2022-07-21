import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static int popFront(Deque deque) {
        if (deque.isEmpty()) {
            return -1;
        }
        return (int) deque.removeFirst();
    }

    public static int popBack(Deque deque) {
        if (deque.isEmpty()) {
            return -1;
        }
        return (int) deque.removeLast();
    }

    public static int isEmpty(Deque deque) {
        if (deque.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int front(Deque deque) {
        if (deque.isEmpty()) {
            return -1;
        } else {
            return (int)deque.peekFirst();
        }
    }

    public static int back(Deque deque) {
        if (deque.isEmpty()) {
            return -1;
        } else {
            return (int)deque.peekLast();
        }
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque deque = new LinkedList();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    sb.append(popFront(deque) + "\n");
                    break;
                case "pop_back":
                    sb.append(popBack(deque) + "\n");
                    break;
                case "size":
                    sb.append(deque.size() + "\n");
                    break;
                case "empty":
                    sb.append(isEmpty(deque) + "\n");
                    break;
                case "front":
                    sb.append(front(deque) + "\n");
                    break;
                case "back":
                    sb.append(back(deque) + "\n");
                    break;
            }
        }

        System.out.println(sb);

        bw.flush();
        br.close();
        bw.close();

    }
}
