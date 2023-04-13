import java.util.Arrays;
class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[3];

		int score = 0;
		int idx = 0;
		for (int i = 0; i < dartResult.length(); i++) {
			char c = dartResult.charAt(i);
			if (i > 0 && c == 48 && dartResult.charAt(i - 1) == 49) {
				score = 10;
				continue;
			}

			if (c >= 48 && c <= 57) {
				score = c - 48;
				continue;
			}



			if (c == 'S') {
				scores[idx] = score;
				idx++;
				continue;
			} else if (c == 'D') {
				scores[idx] = score * score;
				idx++;
				continue;
			} else if (c == 'T') {
				scores[idx] = score * score * score;
				idx++;
				continue;
			}

			if (c == '#') {
				scores[idx - 1] *= -1;
			} else if (c == '*' && i == 2) {
				scores[idx - 1] *= 2;
			} else {
				scores[idx - 1] *= 2;
				scores[idx - 2] *= 2;
			}
		}

		return Arrays.stream(scores).sum();
    }
}