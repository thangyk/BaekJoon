class Solution {
    public String solution(String my_string) {
        char[] arr = {'a', 'e', 'i', 'o', 'u'};

		for (char c : arr) {
			for (int j = 0; j < my_string.length(); j++) {
				if (c == my_string.charAt(j)) {
					my_string = my_string.replaceAll(String.valueOf(my_string.charAt(j)), "");
				}
			}
		}

		return my_string;
    }
}