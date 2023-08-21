import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		char[] arr = br.readLine().toCharArray();

		int r = 31;
		int m = 1_234_567_891;

		Map<Character, Integer> map = new HashMap<>();
		char c = 'a';
		for (int i = 1; i < 27; i++) {
			map.put(c++, i);
		}

		int result = 0;
		for (int i = 0; i < n; i++) {
			result += map.get(arr[i]) * Math.pow(r, i);
		}

		System.out.println(result % m);
	}
}