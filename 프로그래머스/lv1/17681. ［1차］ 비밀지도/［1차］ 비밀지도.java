import java.util.Arrays;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] arr = new String[n];
        Arrays.fill(arr, "");

        int idx = 0;
        while (idx < n) {
            String s1 = String.format("%" + n + "d", Long.parseLong(Integer.toBinaryString(arr1[idx])));
            String s2 = String.format("%" + n + "d", Long.parseLong(Integer.toBinaryString(arr2[idx])));

            String s = "";

            for (int i = 0; i < n; i++) {
                if (s1.charAt(i) == '1' || s2.charAt(i) == '1') {
                    s += "#";
                } else {
                    s += " ";
                }
            }

            arr[idx] = s;
            idx++;
        }

        return arr;
    }
}