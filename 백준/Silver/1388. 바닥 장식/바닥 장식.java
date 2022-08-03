import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static char[][] tile;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        tile = new char[n][m];

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < m; j++) {
                tile[i][j] = input.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i != 0 && tile[i][j] == '|' && tile[i - 1][j] == '|') {
                    continue;
                } else if (j != 0 && tile[i][j] == '-' && tile[i][j - 1] == '-') {
                    continue;
                }
                cnt++;
            }
        }

        System.out.println(cnt);

        br.close();

    }

}