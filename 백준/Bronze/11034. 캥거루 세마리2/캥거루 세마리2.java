import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S;
		
		//null 값 처리
		while((S = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(S);
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			//A부터 B, B부터 C까지의 두 거리중 더 큰 값을 구한다.
			int max = Math.max((B - A), (C - B))-1;
			
			System.out.println(max);
		}
	}

}