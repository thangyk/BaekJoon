import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] prime = new boolean[246913];
		
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
		//에라토스테네스의 체, k = 2부터 N의 루트 이하까지 반복하여 자연수들 중 K를 제외한 K의 배수들을 제외시킨다.
			if(prime[i]) {
				continue;
			}
			
			for(int j = i * i; j < prime.length; j = j + i) {
			//i의 배수 제거
				prime[j] = true;
			}
			
		}
		
		while(true) {
			
			int N = Integer.parseInt(br.readLine());
			
			if(N == 0) {
				break;
			}
			
			int cnt = 0;
				
			for(int i = N + 1; i<= 2 * N; i++) {
				if(prime[i] == false) {
					cnt++;
				}
			}
			
			System.out.println(cnt);
			
		}
		
	}
	
}