import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int[] arrA = new int[a];
            int[] arrB = new int[b];
            int ans = 0;

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arrA.length; j++) {
                arrA[j] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arrB.length; j++) {
                arrB[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arrB);

            for (int j = 0; j < arrA.length; j++) {
                ans += binarySearch(arrB, arrA[j]);
            }
            sb.append(ans).append("\n");
        }

        System.out.println(sb);
        br.close();
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        int len = 0;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] < target) {
                len = mid + 1;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return len;
    }
}