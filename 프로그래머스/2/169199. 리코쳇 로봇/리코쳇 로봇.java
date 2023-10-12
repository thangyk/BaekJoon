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
	static boolean[][] visited;
	static char[][] arr;
	static int h, w;
    public int solution(String[] board) {
        Pos posR = null;
		Pos posG = null;

		h = board.length;
		w = board[0].length();
		visited = new boolean[h][w];
		arr = new char[h][w];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length(); j++) {
				arr[i][j] = board[i].charAt(j);
				if (arr[i][j] == 'R') {
					posR = new Pos(i, j, 0);
				}

				if (arr[i][j] == 'G') {
					posG = new Pos(i, j, 0);
				}
			}
		}

		return bfs(posR, posG);
    }
    
    private static int bfs(Pos posR, Pos posG) {
		Queue<Pos> queue = new LinkedList<>();
		queue.add(posR);
		visited[posR.x][posR.y] = true;

		while (!queue.isEmpty()) {
			Pos poll = queue.poll();
			int tx = poll.x;
			int ty = poll.y;
			int tcnt = poll.cnt;

			if (tx == posG.x && ty == posG.y) {
				return tcnt;
			}

			for (int i = 0; i < 4; i++) {
				Pos pos = getPos(i, poll);

				if (!visited[pos.x][pos.y]) {
					queue.add(pos);
					visited[pos.x][pos.y] = true;
				}
			}
		}

		return -1;
	}

	public static Pos getPos(int i, Pos pos) {
		int x = pos.x;
		int y = pos.y;
		int ix = dx[i];
		int iy = dy[i];

		while (x + ix >= 0 && y + iy >= 0 && x + ix < h && y + iy < w && arr[x + ix][y + iy] != 'D') {
			x += ix;
			y += iy;
		}

		return new Pos(x, y, pos.cnt + 1);
	}
}