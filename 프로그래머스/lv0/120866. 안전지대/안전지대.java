import java.util.LinkedList;
import java.util.Queue;
class Solution {
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dy = {0, -1, -1, -1, 0, 1, 1, 1};
	static boolean[][] visited;
	static int n, x, y;
    static Queue<int[]> queue = new LinkedList<>();
    public static int solution(int[][] board) {
        
        n = board.length;
        visited = new boolean[board.length][board.length];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 1) {
					queue.add(new int[]{i, j});
				}
			}
		}

		int answer = 0;

		bfs(board);
		for (int[] ints : board) {
			for (int anInt : ints) {
				if (anInt == 0) {
					answer++;
				}
			}
		}

		return answer;
	}

	private static void bfs(int[][] board) {
		queue.add(new int[]{x, y});

		while (!queue.isEmpty()) {
			int[] poll = queue.poll();
			int tx = poll[0];
			int ty = poll[1];

			if (board[tx][ty] == 1) {
				for (int i = 0; i < 8; i++) {
					int nx = tx + dx[i];
					int ny = ty + dy[i];

					if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
						if (!visited[nx][ny] && board[nx][ny] == 0) {
							board[nx][ny] = 2;
							visited[nx][ny] = true;
						}
					}
				}
			}
		}
	}
}