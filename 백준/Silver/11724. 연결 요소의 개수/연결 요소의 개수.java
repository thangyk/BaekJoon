import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static boolean[] visited;
    static ArrayList<Integer>[] adjList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        visited = new boolean[n + 1];
        adjList = new ArrayList[n + 1];

        for (int i = 1; i < n + 1; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            adjList[from].add(to);
            adjList[to].add(from);
        }

        int cnt = 0;
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                cnt++;
                dfs(i);
            }
        }

        System.out.println(cnt);

    }

    private static void dfs(int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        for (int i : adjList[v]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }
}
