import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    static int Empty(Deque deque) {
        if (deque.size() == 0) {
            return 1;
        }
        return 0;
    }

    static int popFront(Deque deque) {
        if (deque.isEmpty()) {
            return -1;
        }
        return (int) deque.pollFirst();
    }

    static int popBack(Deque deque) {
        if (deque.isEmpty()) {
            return -1;
        }
        return (int) deque.pollLast();
    }

    static int front(Deque deque) {
        if (deque.isEmpty()) {
            return -1;
        }
        return (int) deque.peekFirst();
    }

    static int back(Deque deque) {
        if (deque.isEmpty()) {
            return -1;
        }
        return (int) deque.peekLast();
    }

    public static void main(String[] args) throws IOException {
        Deque<Integer> deque = new ArrayDeque();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push_back":
                    deque.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case "push_front":
                    deque.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "front":
                    sb.append(front(deque) + "\n");
                    break;
                case "back":
                    sb.append(back(deque) + "\n");
                    break;
                case "size":
                    sb.append(deque.size() + "\n");
                    break;
                case "empty":
                    sb.append(Empty(deque) + "\n");
                    break;
                case "pop_front":
                    sb.append(popFront(deque) + "\n");
                    break;
                case "pop_back":
                    sb.append(popBack(deque) + "\n");
                    break;
            }
        }

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}
