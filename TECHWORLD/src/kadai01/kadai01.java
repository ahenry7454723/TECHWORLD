package kadai01;

public class kadai01 {
		public static void main(String[] args) {

			System.out.println("あなたの名前は？");

			String input1 = new java.util.Scanner(System.in).nextLine();

			System.out.println("あなたの年齢は？");
			int input2 = new java.util.Scanner(System.in).nextInt();

			System.out.println("こんにちは" + input2 + "歳の" + input1 + "さん");
		}

	}

}
