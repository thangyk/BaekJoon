import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int left = 1;
        int right = arr[arr.length - 1] - arr[0];
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (amountWifi(arr, mid) < c) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(right);
        br.close();
    }

    public static int amountWifi(int[] arr, int distance) {
        int cnt = 1;
        int pre = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int cur = arr[i];

            if (cur - pre >= distance) {
                cnt++;
                pre = cur;
            }
        }
        return cnt;
    }

}