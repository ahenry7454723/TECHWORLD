package kadai08_02;

import java.util.Scanner;

public class Story {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Hero h = new Hero("勇者", 100, 50);
		System.out.println("勇者が誕生した");
		System.out.println("名前:" + h.name);
		System.out.println("体力:" + h.hp);
		System.out.println("攻撃力:" + h.at);
		System.out.println("防御力:" + h.df);

		Scanner scan2 = new Scanner(System.in);
		monster m = new monster();
		System.out.println("モンスターが誕生した");
		System.out.println("名前:" + m.name);
		System.out.println("体力:" + m.hp);
		System.out.println("攻撃力:" + m.at);
		System.out.println("防御力:" + m.df);

		Scanner Mscan = new Scanner(System.in);
		magician mag = new magician();
		System.out.println("魔法使いが誕生した");
		System.out.println("名前:" + mag.name);
		System.out.println("体力:" + mag.hp);
		System.out.println("攻撃力:" + mag.mp);

		scan.close();
		scan2.close();
		Mscan.close();
	}

}
