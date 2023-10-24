class LeftHand {
	int x;
	int y;
	int tmp;

	public LeftHand(int x, int y, int tmp) {
		this.x = x;
		this.y = y;
		this.tmp = tmp;
	}
}

class RightHand {
	int x;
	int y;
	int tmp;

	public RightHand(int x, int y, int tmp) {
		this.x = x;
		this.y = y;
		this.tmp = tmp;
	}
}
class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
		LeftHand leftHand = new LeftHand(3, 0, 10);
		RightHand rightHand = new RightHand(3, 2, 12);

		int[][] keypad = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 0, 12}};

		for (int i = 0; i < numbers.length; i++) {
			int num = numbers[i];
			int x = 0;
			int y = 0;
			for (int j = 0; j < keypad.length; j++) {
				for (int k = 0; k < keypad[j].length; k++) {
					if (keypad[j][k] == num) {
						x = j;
						y = k;
					}
				}
			}

			if (num == 1 || num == 4 || num == 7) {
				sb.append("L");
				// 내 왼손 엄지 위치를 해당 숫자로 옮겨주기
				leftHand.tmp = num;
				leftHand.x = x;
				leftHand.y = y;
			} else if (num == 3 || num == 6 || num == 9) {
				sb.append("R");
				// 내 오른손 엄지 위치를 해당 숫자로 옮겨주기
				rightHand.tmp = num;
				rightHand.x = x;
				rightHand.y = y;
			} else {
				// num이 2,5,8,0일 때 어떤 손이 최적인지 정하는 로직
				int leftGap = Math.abs(x - leftHand.x) + Math.abs(y - leftHand.y);
				int rightGap = Math.abs(x - rightHand.x) + Math.abs(y - rightHand.y);

				if (leftGap > rightGap) {
					sb.append("R");
					rightHand.tmp = num;
					rightHand.x = x;
					rightHand.y = y;
				} else if (leftGap < rightGap) {
					sb.append("L");
					leftHand.tmp = num;
					leftHand.x = x;
					leftHand.y = y;
				} else {
					if (hand.equals("right")) {
						sb.append("R");
						rightHand.tmp = num;
						rightHand.x = x;
						rightHand.y = y;
					} else {
						sb.append("L");
						leftHand.tmp = num;
						leftHand.x = x;
						leftHand.y = y;
					}
				}
			}
		}

		return sb.toString();
	}
}