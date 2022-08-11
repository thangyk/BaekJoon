import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int left = 0;
        int right = 0;

        int[] trees = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < trees.length; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            right = Math.max(right, trees[i]);
        }

        while (left <= right) {
            int mid = left + (right - left) / 2; // 절단기 높이
            long sum = 0;

            for (int tree : trees) {
                if (tree > mid) {
                    sum += tree - mid;
                }
            }

            if (sum < M) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(left-1);
        br.close();
    }
}
