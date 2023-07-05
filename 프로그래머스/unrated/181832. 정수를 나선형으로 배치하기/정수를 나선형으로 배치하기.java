class Solution {
    public int[][] solution(int n) {
        int[][] arr = new int[n][n];

		int num = 1;
		int rowStart = 0;
		int colStart = 0;
		int rowEnd = n - 1;
		int colEnd = n - 1;

		while (num <= n * n) {

			for (int i = colStart; i <= colEnd; i++) {
				arr[rowStart][i] = num++;
			}
			rowStart++;

			for (int i = rowStart; i <= rowEnd; i++) {
				arr[i][colEnd] = num++;
			}
			colEnd--;

			for (int i = colEnd; i >= colStart; i--) {
				arr[rowEnd][i] = num++;
			}
			rowEnd--;

			for (int i = rowEnd; i >= rowStart; i--) {
				arr[i][colStart] = num++;
			}
			colStart++;
		}

		return arr;
    }
}