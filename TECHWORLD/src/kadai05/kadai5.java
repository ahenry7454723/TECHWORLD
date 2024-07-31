package kadai05;

import java.util.Arrays;

public class kadai5 {

	public static void main(String[] args) {
		array_sort();

	}

	public static void array_sort() {
		int[] num = new int[] { 10, 3, 100, 90, 54 };

		// 配列の値を昇順に並び変える処理
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		// 配列の値の合計値を求める処理
		int sum = Arrays.stream(num).sum();

		// 配列の値の平均値を求める処理
		double average = Arrays.stream(num).average().getAsDouble();

		// 配列の値の最大値を求める処理
		int intMax = num[0];
		for (int m = 1; m < num.length; m++) {
			if (intMax < num[m]) {
				intMax = num[m];
			}
		}

		// 配列の値の最小値を求める処理
		int intMin = num[0];
		for (int m = 1; m < num.length; m++) {
			if (intMin > num[m]) {
				intMin = num[m];
			}
		}

		System.out.println("合計値:" + sum);
		System.out.println("平均値:" + average);
		System.out.println("最大値:" + intMax);
		System.out.println("最小値:" + intMin);
	}
}
