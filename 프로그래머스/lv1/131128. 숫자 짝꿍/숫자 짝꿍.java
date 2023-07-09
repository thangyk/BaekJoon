class Solution {
    public String solution(String X, String Y) {
        int[] arr = new int[10];
		int[] brr = new int[10];

		for (int i = 0; i < X.length(); i++) {
			int a = X.charAt(i) - 48;
			arr[a]++;
		}

		for (int i = 0; i < Y.length(); i++) {
			int b = Y.charAt(i) - 48;
			brr[b]++;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 9; i >= 0; i--) {
			int n = Math.min(arr[i], brr[i]);

			if (arr[i] > 0 && brr[i] > 0) {
				for (int j = 0; j < n; j++) {
					sb.append(i);
				}
			}
		}
		
		if (sb.toString().equals("")) {
			return "-1";
		} else if (sb.charAt(0) == '0') {
			return "0";
		} else {
			return sb.toString();
		}
    }
}