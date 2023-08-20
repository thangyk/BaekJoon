import java.util.*;
class Solution {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static boolean[][] visited;
    static int n, m;
    static int[][] mapss;
    public int solution(int[][] maps) {
        mapss = maps;
        n = maps.length;    
        m = maps[0].length; 
        visited = new boolean[n][m];
        
        visited[0][0] = true;
        bfs();
        int cnt = mapss[n - 1][m - 1];
        System.out.print(cnt);
        return cnt < 2 ? -1 : cnt;
    }
    
    static void bfs() {
        Queue<int[]> queue = new LinkedList();
        queue.add(new int[] {0, 0});
        
        while(!queue.isEmpty()) {
            int[] pos = queue.poll();
            int x = pos[0];
            int y = pos[1];
            
            for(int i = 0 ; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if(!visited[nx][ny] && mapss[nx][ny] == 1) {
                        queue.add(new int[] {nx, ny});
                        visited[nx][ny] = true;
                        mapss[nx][ny] = mapss[x][y] + 1;
                    }
                }
            }
            
        }
        
    }
    
}