import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<String, Integer> map = new HashMap<>();
		StringTokenizer st;
		for (String s : terms) {
			st = new StringTokenizer(s, " ");
			map.put(st.nextToken(), Integer.parseInt(st.nextToken()));
		}

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < privacies.length; i++) {
			st = new StringTokenizer(privacies[i], ". ");
			String year = st.nextToken();
			String month = st.nextToken();
			String day = st.nextToken();
			String type = st.nextToken();

			st = new StringTokenizer(today, ".");
			String now = st.nextToken() + st.nextToken() + st.nextToken();

			int term = map.get(type);
			if (Integer.parseInt(month) + term > 12) {
				year = Integer.parseInt(year) + (Integer.parseInt(month) + term) / 12 + "";
				month = String.format("%02d", (Integer.parseInt(month) + term) % 12);
				if (month.equals("00")) {
					month = "12";
					year = Integer.parseInt(year) - 1 + "";
				}
				if (day.equals("01") && Integer.parseInt(month) > 1) {
					month = String.format("%02d", Integer.parseInt(month) - 1);
					day = "28";
				} else if (day.equals("01") && Integer.parseInt(month) == 1) {
					year = Integer.parseInt(year) - 1 + "";
					month = "12";
					day = "28";
				} else {
					day = String.format("%02d", Integer.parseInt(day) - 1);
				}
			} else {
				if (day.equals("01")) {
					day = "28";
					month = String.format("%02d", Integer.parseInt(month) + term - 1);
				} else {
					day = String.format("%02d", Integer.parseInt(day) - 1);
					month = String.format("%02d", Integer.parseInt(month) + term);
				}
			}

			String date = year + month + day;
			if (Integer.parseInt(now) - Integer.parseInt(date) > 0) {
				list.add(i + 1);
			}
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
    }
}