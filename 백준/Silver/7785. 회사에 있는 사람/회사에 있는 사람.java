import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String work = st.nextToken();
			if (map.containsKey(name) && map.get(name).equals("enter") && work.equals("leave")) {
				map.remove(name);
			} else {
				map.put(name, work);
			}
		}

		List<String> list = new ArrayList<>(map.keySet());
		list.sort(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		for (String s : list) {
			sb.append(s).append("\n");
		}
		System.out.println(sb);
	}
}