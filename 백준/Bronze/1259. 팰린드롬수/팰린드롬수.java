import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = -1;
        StringBuilder sb = new StringBuilder();
        while (true) {
            n = Integer.parseInt(br.readLine());

            if (n == 0) {
                break;
            }

            int[] arr = new int[String.valueOf(n).length()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = String.valueOf(n).charAt(i) - 48;
            }

            int left = 0;
            int right = arr.length - 1;

            boolean isCheck = true;
            while (left <= right) {
                if (arr[left] == arr[right]) {
                    left++;
                    right--;
                } else {
                    isCheck = false;
                    sb.append("no\n");
                    break;
                }
            }

            if (isCheck) {
                sb.append("yes\n");
            }

        }

        System.out.println(sb);
        br.close();

    }
}