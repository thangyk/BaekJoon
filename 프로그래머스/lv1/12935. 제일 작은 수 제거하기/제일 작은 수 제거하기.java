class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length == 1 ? 1 : arr.length - 1];

        if (arr.length == 1) {
            return new int[]{-1};
        }

        int idx = 0;
        int min = findMin(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer[idx++] = arr[i];
            } else {
                continue;
            }
        }

        return answer;
    }

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }

        return min;
    }
}