import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int t = 20;	// 입력으로 들어오는 개수
		int totalScore = 0; // 학점의 총합
		double totalGrade = 0.0; // 평점의 총합

		String[] gradeString = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
		Double[] gradeDouble = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
		Map<String, Double> map = new HashMap<>();

		for (int i = 0; i < 9; i++) {
			map.put(gradeString[i], gradeDouble[i]);
		}

		StringTokenizer st;
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());

			String subject = st.nextToken();
			double score = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();

			if (grade.equals("P")) {
				continue;
			}

			totalScore += score;
			totalGrade += score * map.get(grade);
		}

		System.out.println(String.format("%.6f", totalGrade / totalScore));
	}
}