import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int[] alphabet = new int[26];

        String input = sc.next().toUpperCase();
        sb.append(input);

        for (int i = 0; i < sb.length(); i++) {
            int num = sb.charAt(i) - 'A';
            alphabet[num]++;
        }

        int max = 0;
        char c = ' ';
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                c = (char) (i + 65);
            } else if (alphabet[i] == max) {
                c = '?';
            }
        }

        System.out.println(c);

    }
}
