import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] arr;
    static int N, k;

    public static void main(String[] args) throws Exception {

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        k = Integer.parseInt(br.readLine());

        div(arr, 0, 0);
        for (int item : arr) {
            System.out.print(item + " ");
        }

        br.close();
    }

    public static void div(int[] arr, int n, int size) {

        size = arr.length / k;

        for (int i = 0; i < k; i++) {
            Arrays.sort(arr, n, n + size);
            n += size;
        }

    }

}