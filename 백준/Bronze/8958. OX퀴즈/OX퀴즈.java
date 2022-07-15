import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int t = sc.nextInt();
    	
    	String arr[] = new String[t];
    	
    	for(int i = 0; i<t; i++ ) {
    		arr[i] = sc.next();
    	}											// 배열에 저장완료
    	
    	for(int i = 0; i<t; i++) {
    		int cnt = 0;
    		int sum = 0;
    		
    		for(int j = 0; j<arr[i].length(); j++) {
    			if(arr[i].charAt(j) == 'O') {
    				cnt++;
    				sum+= cnt;
    			}
    			else {
    				cnt =0;
    			}
    		}
    		System.out.println(sum);
    	}
    }
}