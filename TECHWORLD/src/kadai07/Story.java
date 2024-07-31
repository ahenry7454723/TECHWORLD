package kadai07;

import java.util.Scanner;

public class Story {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Hero h = new Hero();
		System.out.println("勇者の名前を設定してください");
		h.name = scan.nextLine();

		System.out.println("勇者の体力を設定してください");
		h.hp = scan.nextInt();

		System.out.println("勇者の攻撃力を設定してください");
		h.at = scan.nextInt();

		System.out.println("勇者の防御力を設定してください");
		h.df = scan.nextInt();

		System.out.println("勇者が誕生した");
		System.out.println("名前:" + h.name);
		System.out.println("体力:" + h.hp);
		System.out.println("攻撃力:" + h.at);
		System.out.println("防御力:" + h.df);

		Scanner scan2 = new Scanner(System.in);

		monster m = new monster();
		System.out.println("モンスターの名前を設定してください");
		m.name = scan2.nextLine();

		System.out.println("モンスターの攻撃力を設定してください");
		m.at = scan2.nextInt();

		System.out.println("モンスターの防御力を設定してください");
		m.df = scan2.nextInt();

		System.out.println("モンスターが誕生した");
		System.out.println("名前:" + m.name);
		System.out.println("体力:" + m.hp);
		System.out.println("攻撃力:" + m.at);
		System.out.println("防御力:" + m.df);

		Scanner Mscan = new Scanner(System.in);

		magician mag = new magician();
		System.out.println("魔法使いの名前を設定してください");
		m.name = scan2.nextLine();

		System.out.println("魔法使いのの体力を設定してください");
		m.at = scan2.nextInt();

		System.out.println("魔法使いのMPを設定してください");
		m.df = scan2.nextInt();

		System.out.println("魔法使いが誕生した");
		System.out.println("名前:" + mag.name);
		System.out.println("体力:" + mag.hp);
		System.out.println("攻撃力:" + mag.mp);

		scan.close();
		scan2.close();
		Mscan.close();
	}

}
