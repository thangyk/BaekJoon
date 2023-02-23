class Solution {
    public String solution(int[] food) {
        String str = "";

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int n = food[i] / 2;
            for (int j = 0; j < n; j++) {
                sb.append(i);
            }
        }

        str = String.join("", sb) + "0" + String.join("", sb.reverse());

        return str;
    }
}