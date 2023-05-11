import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] arr = br.readLine().split("");
		Arrays.sort(arr, (o1, o2) -> o2.charAt(0) - o1.charAt(0));
		System.out.println(String.join("", arr));
	}
}