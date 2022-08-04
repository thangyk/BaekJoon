import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        char[] input = br.readLine().toLowerCase().toCharArray();

        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        for (int i = 0; i < input.length; i++) {
            if (alphabet[input[i] - 'a'] == -1) {
                alphabet[input[i] - 'a'] = i;
            }
        }

        for (int i : alphabet) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        br.close();
    }
}