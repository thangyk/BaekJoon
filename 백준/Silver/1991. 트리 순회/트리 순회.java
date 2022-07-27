import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node {
    char data;
    Node left;
    Node right;

    public Node(char data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

public class Main {

    static Node root = new Node('A', null, null);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            char head = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            add(root, head, left, right);
        }

        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);


        br.close();
    }

    public static void add(Node node, char head, char left, char right) {
        if (node.data == head) {
            if (left == '.') {
                node.left = null;
            } else {
                node.left = new Node(left, null, null);
            }

            if (right == '.') {
                node.right = null;
            } else {
                node.right = new Node(right, null, null);
            }
        } else {
            if (node.left != null) {
                add(node.left, head, left, right);
            }
            if (node.right != null) {
                add(node.right, head, left, right);
            }
        }
    }

    public static void preOrder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.data);
        inOrder(node.right);
    }

    public static void postOrder(Node node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data);
    }

}

