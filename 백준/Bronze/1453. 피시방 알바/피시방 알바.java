import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int seat = sc.nextInt();

            if (map.containsKey(seat)) {
                cnt++;
            }
            map.put(seat, 1);
        }

        System.out.println(cnt);


    }
}