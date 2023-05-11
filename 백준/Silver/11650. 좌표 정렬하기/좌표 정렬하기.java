import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<XY> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list.add(new XY(x, y));
		}

		list.sort((o1, o2) -> {
			if (o1.x == o2.x) {
				return o1.y - o2.y;
			} else {
				return o1.x - o2.x;
			}
		});

		StringBuilder sb = new StringBuilder();
		for (XY xy : list) {
			sb.append(xy.x).append(" ").append(xy.y).append("\n");
		}
		System.out.println(sb);
	}

	static class XY {
		int x;
		int y;

		XY(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}