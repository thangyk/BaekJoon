class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = wallpaper.length;
        int luy = wallpaper[0].length();
        int dux = -1;
        int duy = -1;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[0].length(); j++) {
                if (String.valueOf(wallpaper[i].charAt(j)).equals("#")) {
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);
                    dux = Math.max(dux, i + 1);
                    duy = Math.max(duy, j + 1);
                }
            }
        }

        return new int[]{lux, luy, dux, duy};
    }
}