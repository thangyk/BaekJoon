import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int r = (int) (Math.min(arr[1]-arr[0],arr[2]-arr[1]));

        int idx = -1;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] + r != arr[i + 1]) {
                idx = i;
                break;
            } else {
                idx = arr.length-1;
            }
        }

        System.out.println(arr[idx]+r);

    }
}