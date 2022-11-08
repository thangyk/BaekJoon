import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    static class Node {
        HashMap<String, Node> child;

        public Node() {
            this.child = new HashMap<>();
        }

        public void insert(String str) {
            Node node = this;
            String[] dirs = str.split("\\\\");
            for (String s : dirs) {
                node.child.putIfAbsent(s, new Node());
                node = node.child.get(s);
            }
        }

        public void print(Node node, int idx) {
            Node cur = node;
            if (cur.child != null) {
                List<String> list = new ArrayList<>(node.child.keySet());
                Collections.sort(list);
                for (String s : list) {
                    for (int i = 0; i < idx; i++) {
                        System.out.print(" ");
                    }
                    System.out.println(s);
                    print(cur.child.get(s), idx + 1);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Node trie = new Node();
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            trie.insert(line);
        }

        trie.print(trie, 0);

        br.close();
    }
}