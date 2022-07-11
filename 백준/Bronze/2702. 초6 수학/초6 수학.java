import java.util.Scanner;

public class Main {

    static int getGcd(int a, int b) {

        if (a % b == 0) {
            return b;
        }

        return getGcd(b, a % b);
    }

    static int getLcm(int a, int b) {
        return (a * b) / getGcd(a, b);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.print(getLcm(a, b) + " ");
            System.out.print(getGcd(a, b) + "\n");
        }


    }

}