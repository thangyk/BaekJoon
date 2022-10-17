import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int gcd = arr[1] - arr[0];
        for (int i = 2; i < n; i++) {
            gcd = getGCD(gcd, arr[i] - arr[i - 1]);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(gcd); i++) {
            if (i * i == gcd) {
                list.add(i);
            } else if (gcd % i == 0) {
                list.add(i);
                list.add(gcd / i);
            }
        }

        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (int item : list) {
            sb.append(item).append(' ');
        }
        sb.append(gcd);
        System.out.println(sb);
        br.close();
    }
    public static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }

}