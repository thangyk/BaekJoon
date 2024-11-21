import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();

		Set<String> set = new HashSet<>();
		set.add("Fizz");
		set.add("Buzz");
		set.add("FizzBuzz");

		if (!set.contains(a)) {
			c = String.valueOf(Integer.parseInt(a) + 2);
		}

		if (!set.contains(b)) {
			c = String.valueOf(Integer.parseInt(b) + 1);
		}

		int next = Integer.parseInt(c) + 1;
		if (next % 3 == 0 && next % 5 == 0) {
			System.out.println("FizzBuzz");
		} else if (next % 3 == 0 && next % 5 != 0) {
			System.out.println("Fizz");
		} else if (next % 3 != 0 && next % 5 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println(next);
		}
	}
}
