package kadai03;

// 0から100までの数字の中で、3の倍数または5の倍数であるが15の倍数ではない数を出力する
public class kadai3_2 {

	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			// 3の倍数と5の倍数で15の倍数ではない値を出力する
			if (i % 3 == 0 || i % 5 == 0) {
				if (i % 15 != 0) {
					System.out.println(i);
				}

			}

		}

	}

}
