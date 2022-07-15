import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] emp = new String[n];

        for (int i = 0; i < emp.length; i++) {
            emp[i] = sc.next();
        }

        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i].toLowerCase());
        }
    }
}