import java.util.LinkedList;
import java.util.Queue;
class Pos {
	int x;
	int y;
	int cnt;

	public Pos(int x, int y, int cnt) {
		this.x = x;
		this.y = y;
		this.cnt = cnt;
	}
}
class Solution {
    static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, -1, 0, 1};
	static int h, w;
	static boolean[][] visited;
	static char[][] miro;
    public int solution(String[] maps) {
        h = maps.length;
		w = maps[0].length();
		miro = new char[h][w];
		visited = new boolean[h][w];
		Pos posS = null;
		Pos posL = null;
		Pos posE = null;

		for (int i = 0; i < maps.length; i++) {
			for (int j = 0; j < maps[i].length(); j++) {
				miro[i][j] = maps[i].charAt(j);

				if (miro[i][j] == 'S') {
					posS = new Pos(i, j, 0);
				}

				if (miro[i][j] == 'L') {
					posL = new Pos(i, j, 0);
				}

				if (miro[i][j] == 'E') {
					posE = new Pos(i, j, 0);
				}
			}
		}

		int cnt = bfs(posS.x, posS.y, h, w, posL.x, posL.y);
		if (cnt > -1) {
			visited = new boolean[h][w];

			int tmp = bfs(posL.x, posL.y, h, w, posE.x, posE.y);

			if (tmp == -1) {
				return -1;
			} else {
				return cnt + tmp;
			}
		}

		return -1;
    }
    
    private static int bfs(int sx, int sy, int h, int w, int ex, int ey) {
		Queue<Pos> queue = new LinkedList<>();
		queue.add(new Pos(sx, sy, 0));

		while (!queue.isEmpty()) {
			Pos poll = queue.poll();
			int tx = poll.x;
			int ty = poll.y;
			int tcnt = poll.cnt;

			if (tx == ex && ty == ey) {
				return tcnt;
			}

			for (int i = 0; i < 4; i++) {
				int nx = tx + dx[i];
				int ny = ty + dy[i];

				if (nx >= 0 && ny >= 0 && nx < h && ny < w) {
					if (!visited[nx][ny] && miro[nx][ny] != 'X') {
						queue.add(new Pos(nx, ny, tcnt + 1));
						visited[nx][ny] = true;
					}
				}
			}
		}

		return -1;
	}
}