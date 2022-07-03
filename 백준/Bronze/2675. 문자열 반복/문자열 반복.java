import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int n = 0;
        String str = "";

        for (int i = 0; i < testCase; i++) {
            n = sc.nextInt();
            str = sc.next();

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < n; k++) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}