import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int getGcd(int a, int b) {

        int gcd = -1;

        ArrayList devisiorA = new ArrayList();
        ArrayList devisiorB = new ArrayList();

        for (int i = 1; i <= a/2; i++) {
            if (a % i == 0) {
                devisiorA.add(i);
            }
        }
        devisiorA.add(a);

        for (int i = 1; i <= b / 2; i++) {
            if (b % i == 0) {
                devisiorB.add(i);
            }
        }
        devisiorB.add(b);

        for (int item1 : (ArrayList<Integer>) devisiorA) {
            for (int item2 : (ArrayList<Integer>) devisiorB) {
                if (item1 == item2) {
                    gcd = Math.max(gcd, item1);
                }
            }
        }
    return gcd;

    }

    public static int getLcm(int a, int b) {

        return (a*b)/getGcd(a,b);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(getGcd(a,b));
        System.out.println(getLcm(a,b));


    }
}