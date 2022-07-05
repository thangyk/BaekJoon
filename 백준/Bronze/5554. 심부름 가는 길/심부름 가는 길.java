import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 4; i++) {
            sum += sc.nextInt();
        }

        int x = sum / 60;
        int y = sum % 60;

        System.out.println(x);
        System.out.println(y);
    }
}