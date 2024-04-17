class Solution {
    public String solution(int age) {
        String[] brr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

		StringBuilder str = new StringBuilder();
		while (age > 0) {
			int d = age % 10;
			age /= 10;
			String s = brr[d];

			str.insert(0, s);
		}

		return str.toString();
    }
}