import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    static int getMin(int x, int y, int w, int h) {
        return IntStream.builder().add(x).add(w-x).add(h-y).add(y).build().min().getAsInt();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        System.out.println(getMin(x,y,w,h));

    }
}