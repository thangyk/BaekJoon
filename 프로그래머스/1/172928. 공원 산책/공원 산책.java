import java.util.StringTokenizer;
class Solution {
    static int h, w;
    public int[] solution(String[] park, String[] routes) {
        int sx = 0;
		int sy = 0;
		h = park.length;
		w = park[0].length();

		char[][] arr = new char[h][w];
		for (int i = 0; i < park.length; i++) {
			for (int j = 0; j < park[0].length(); j++) {
				arr[i][j] = park[i].charAt(j);
				if (arr[i][j] == 'S') {
					sx = i;
					sy = j;
				}
			}
		}

		return res(sx, sy, arr, routes);
    }
    
    public static int[] res(int sx, int sy, char[][] arr, String[] routes) {
		for (String route : routes) {
			StringTokenizer st = new StringTokenizer(route, " ");
			String dir = st.nextToken();
			int dist = Integer.parseInt(st.nextToken());

			int nx = sx;
			int ny = sy;
			for (int j = 1; j <= dist; j++) {
				switch (dir) {
					case "N":
						nx--;
						break;
					case "E":
						ny++;
						break;
					case "W":
						ny--;
						break;
					default:
						nx++;
						break;
				}

				if (nx >= 0 && ny >= 0 && nx < h && ny < w) {
					if (arr[nx][ny] == 'X') {
						break;
					}

					if (j == dist) {
						sx = nx;
						sy = ny;
					}

				}
			}
		}

		return new int[]{sx, sy};
	}
}