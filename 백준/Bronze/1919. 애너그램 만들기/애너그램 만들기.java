import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[26];
		int[] brr = new int[26];

		String str1 = br.readLine();
		String str2 = br.readLine();

		for (int i = 0; i < str1.length(); i++) {
			arr[str1.charAt(i) - 97]++;
		}

		for (int i = 0; i < str2.length(); i++) {
			brr[str2.charAt(i) - 97]++;
		}

		int answer = 0;
		for (int i = 0; i < 26; i++) {
			answer += Math.abs(arr[i] - brr[i]);
		}

		System.out.println(answer);
	}
}