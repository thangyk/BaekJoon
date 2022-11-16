import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;
        int a = 0, b = 0;
        int min = Integer.MAX_VALUE;

        while (left < right) {
            int val = Math.abs(arr[left] + arr[right]);

            if (min > val) {
                min = val;
                a = arr[left];
                b = arr[right];
            }

            if (arr[left] + arr[right] > 0) {
                right--;
            } else {
                left++;
            }
        }

        System.out.println(a + " " + b);
        br.close();
    }


}