package kadai02;

public class kadai02 {
	public static void main(String[] args) {

		System.out.println("入力した2つの数で四則演算をおこないます。");

		System.out.println("1つ目の数を入力してください。");
		int num1 = new java.util.Scanner(System.in).nextInt();

		System.out.println("2つ目の数を入力してください。");
		int num2 = new java.util.Scanner(System.in).nextInt();

		int sum_ans = num1 + num2;
		int subtraction_ans = num1 - num2;
		int multiplication_ans = num1 - num2;
		double division_ans = (double) num1 / num2;

		// 四則演算の合計値を表示
		System.out.println("足し算の合計:" + sum_ans + "です。");
		System.out.println("引き算の合計:" + subtraction_ans + "です。");
		System.out.println("かけ算の合計:" + multiplication_ans + "です。");
		System.out.println("わり算の合計:" + division_ans + "です。");

		// 最大値を表示
		System.out.println("四則演算の結果1番大きな数だけを表示します。");
		int max = Math.max(sum_ans, Math.max(subtraction_ans, Math.max(multiplication_ans, (int) division_ans)));
		System.out.println("四則演算の結果で最大の数は:" + max + "です。");
	}

}

