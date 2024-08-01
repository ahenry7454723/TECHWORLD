package kadai07;

public class monster {
	// フィールド
	String name; // 名前
	int hp; // HP 
	int at; // 攻撃力
	int df; // 防御力

	void atack() {
		System.out.println(this.at+"の攻撃");
		System.out.println(this.at+"のダメージ");
	}
	
	void defense() {
		System.out.println(this.name+"は守りを固めた");
		this.df = this.df+10;
		System.out.println("防御力が10上がった");
	}
}
