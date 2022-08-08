import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 나무의 수
        int M = Integer.parseInt(st.nextToken());   // 나무의 길이

        // 나무 배열
        int[] trees = new int[N];

        int min = 0;
        int max = 0;

        //나무의 높이 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());

            if (max < trees[i]) {
                max = trees[i];
            }
        }

        // 배열의 가운데 인덱스 기준

        while (min < max) {
            int H = (min + max) / 2;
            long sum = 0;

            for (int tree : trees) {
                if (tree > H) {
                    sum += tree - H;
                }
            }

            if (sum < M) {
                max = H;
            } else {
                min = H + 1;
            }
        }

        System.out.println(min - 1);

        br.close();

    }
}
