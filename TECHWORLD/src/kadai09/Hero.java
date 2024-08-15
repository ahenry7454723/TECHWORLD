package kadai09;

public class Hero {
	// フィールド
	private String name; // 名前(3文字以上、10文字以下でnullはNG)
	private int hp; // HP 
	private int at; // 攻撃力
	private int df; // 防御力

	public String getHeroName() {
		return this.name;
	}

	public void setHeroName(String name) {
		if (name == null || name.length() < 3 || name.length() > 10) {
			throw new IllegalArgumentException("名前は3文字以上、10文字以下でnullはNGです。");
		}
		this.name = name;
	}

	public int getHeroHp() {
		return this.hp;
	}

	public void setHeroHp(int hp) {
		if (hp < 0) {
			hp = 0;
		}
		this.hp = hp;
	}

	public int getHeroAt() {
		return this.at;
	}

	public void setHeroAt(int at) {
		if(at <0) {
			at = 0;
		}
		this.at = at;
	}

	public int getHeroDf() {
		return this.df;
	}

	public void setHeroDf(int df) {
		if(df <0) {
			df = 0;
		}
		this.df = df;
	}

	// メソッド
	// 攻撃
	public void atack() {
		System.out.println(this.name + "の攻撃!");
		System.out.println("敵にダメージを" + this.at + "与えた");
	}

	// 防御
	public void defense() {
		System.out.println("勇者が防御した");
		this.df = this.df + 10;
		System.out.println("防御力が10upし、" + this.df + "になった");
	}

	public void hea() {
		System.out.println("勇者が休憩した");
		this.hp = this.hp + 10;
		System.out.println("HPが10回復し、" + this.hp + "になった");

	}

}
