import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		String sb = avg(arr) + "\n" +
			middle(arr) + "\n" +
			many(arr) + "\n" +
			range(arr) + "\n";

		System.out.println(sb);
	}

	// 산술평균 : N개의 수들의 합을 N으로 나눈 값
	public static int avg(int[] arr) {
		double result = 0.0f;
		for (double i : arr) {
			result += i;
		}

		return (int) Math.round(result / (double) arr.length);
	}

	// 중앙값 : N개의 수들을 정렬했을 때 중앙에 위치하는 값
	public static int middle(int[] arr) {
		Arrays.sort(arr);

		return arr[arr.length / 2];
	}

	// 최빈값 : N개의 수들 중 가장 많이 나타나는 값, 여러개라면 두 번째로 작은 값
	public static int many(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		int max = 0;
		for (int value : map.values()) {
			max = Math.max(max, value);
		}

		ArrayList<Integer> list = new ArrayList<>();
		for (Map.Entry<Integer, Integer> item : map.entrySet()) {
			if (item.getValue() == max) {
				list.add(item.getKey());
			}
		}
		Collections.sort(list);

		return list.size() > 1 ? list.get(1) : list.get(0);
	}

	// 범위 : N개의 수들 중 최댓값과 최솟값의 차이
	public static int range(int[] arr) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i : arr) {
			max = Math.max(max, i);
			min = Math.min(min, i);
		}

		return max - min;
	}
}