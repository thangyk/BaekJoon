import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] burger = new int[3];
        for (int i = 0; i < burger.length; i++) {
            burger[i] = sc.nextInt();
        }
        Arrays.sort(burger);

        int[] drink = new int[2];
        for (int i = 0; i < drink.length; i++) {
            drink[i] = sc.nextInt();
        }
        Arrays.sort(drink);

        int sum = 0;

        for (int i = 0; i < 1; i++) {
            sum = (burger[i] + drink[i]) - 50;
        }
        System.out.println(sum);
    }
}