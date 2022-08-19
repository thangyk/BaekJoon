import java.io.*;
import java.util.*;

public class Main {
    static int[] colors = new int[2];
    static int[][] board;
    static void cut(int x, int y, int size){
        if(size==1) {
            colors[board[x][y]]++; return;
        }
        int sum = 0;
        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
                sum+=board[i+x][j+y];
        if(sum==0) colors[0]++;
        else if(sum==size*size) colors[1]++;
        else{
            size/=2;
            cut(x,y,size);
            cut(x+size,y,size);
            cut(x,y+size,size);
            cut(x+size,y+size,size);
        }
    }
    public static void main(String args[]) throws Exception {
        int n = readInt();
        board = new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                board[i][j] = readInt();
        cut(0,0,n);
        System.out.println(colors[0]+"\n"+colors[1]);
    }
    
    static int readInt() throws IOException {
        int n = 0;
        int input;
        while((input = System.in.read()) <= 32);
        while (true) {
            if (input>47 && input<58)
                n = (n<<3) + (n<<1) + (input&15);
            else return n;
            input = System.in.read();
        }
    }
}