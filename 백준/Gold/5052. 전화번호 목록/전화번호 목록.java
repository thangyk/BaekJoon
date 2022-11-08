import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            String[] nums = new String[n];
            for (int j = 0; j < n; j++) {
                nums[j] = br.readLine();
            }
            Arrays.sort(nums);

            boolean isCheck = false;
            for (int j = 1; j < n; j++) {
                if (nums[j].startsWith(nums[j - 1])) {
                    sb.append("NO\n");
                    isCheck = true;
                    break;
                }
            }
            if (!isCheck) {
                sb.append("YES\n");
            }
        }

        System.out.println(sb);
        br.close();
    }
}