package kadai08_02;

public class Hero {
	// フィールド
	String name; // 名前
	int hp; // HP 
	int at; // 攻撃力
	int df; // 防御力
	
	/**
	 * コンストラクタ①
	 * new Hero("名前",10)のように名前、体力を指定して
	 * インスタンス化することができる
	 */
	public Hero(String name , int hp) {
		this.name = name;
		this.hp = hp;
	}

	/**
	 * コンストラクタ②
	 * new Hero("名前",10,30)のように名前、体力、攻撃力を指定して
	 * インスタンス化することができる
	 */
	public Hero(String name , int hp ,int at) {
		this.name = name;
		this.hp=hp;
		this.at = at;
	}	
	
	/**
	 * コンストラクタ③
	 * new Hero()のような名前を指定してなければ
	 * インスタンス化することはできない
	 */
	public Hero() {

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
