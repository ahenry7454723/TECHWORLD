package kadai03;

public class kadai3_3 {
	//0から100までの整数で2数の和が3の倍数になるものを組み合わせてすべて出力する
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			for (int y = i; y <= 100; y++) {
				if ((i + y) % 3 == 0) {
					System.out.println(i + y);
				}
			}
		}
	}
}
