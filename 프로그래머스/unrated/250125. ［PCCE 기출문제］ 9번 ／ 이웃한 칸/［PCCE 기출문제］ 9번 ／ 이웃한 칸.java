class Solution {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int n;
    public int solution(String[][] board, int h, int w) {   
        n = board.length; 
            
        return bfs(board, h, w, board[h][w]);
    }
    
    public static int bfs(String[][] board, int h, int w, String color) {
        int ans = 0;         
        for(int i = 0; i < 4; i++) {
            int nx = h + dx[i];
            int ny = w + dy[i];
                
            if(nx >= 0 && ny >= 0 && nx < n && ny < n) {
                if(board[nx][ny].equals(color)) {
                    ans++;
                }
             }
        }   
        
        return ans;
    }
    
}