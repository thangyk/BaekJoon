import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a3 = sc.nextInt();

            if (a1 == 0 && a2 == 0 && a3 == 0) {
                break;
            }

            int ap = 0;
            int gp = 1;
            if (a3 - a2 == a2 - a1) {
                ap = a3 - a2;
                System.out.print("AP " + (ap + a3) + '\n');
            } else if (a3 / a2 == a2 / a1) {
                gp = a3 / a2;
                System.out.print("GP " + (a3 * gp) + '\n');
            }
        }
    }
}