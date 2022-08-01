import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br;
    static BufferedWriter bw;
    static boolean[] visited;
    static ArrayList<Integer>[] adjList;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

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

        bw.write(String.valueOf(cnt));

        bw.flush();
        br.close();
        bw.close();
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