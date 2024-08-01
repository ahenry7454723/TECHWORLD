package kadai08_01;

public class Hero {
	// フィールド
	String name; // 名前
	int hp; // HP 
	int at; // 攻撃力
	int df; // 防御力
	
	Hero(String name){
		this.name=name;
		this.hp=200;
		this.at=15;
		this.df=25;
	}

	// メソッド
	// 攻撃
	void atack() {
		System.out.println(this.name + "の攻撃!");
		System.out.println("敵にダメージを" + this.at + "与えた");
	}

	// 防御
	void defense() {
		System.out.println("勇者が防御した");
		this.df = this.df +10;
		System.out.println("防御力が10upし、"+ this.df +"になった");
	}

	void hea() {
		System.out.println("勇者が休憩した");
		this.hp = this.hp + 10;
		System.out.println("HPが10回復し、"+ this.hp +"になった");

	}
}
