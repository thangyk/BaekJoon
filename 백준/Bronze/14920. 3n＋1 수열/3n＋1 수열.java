import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 0;
        while (true) {

            cnt++;

            if (n == 1) {
                break;
            }

            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }

        }

        System.out.println(cnt);


    }
}