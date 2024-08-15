package kadai10_03;

public class magician {
	private String name; // 名前(3文字以上、10文字以下でnullはNG)
	private int hp;
	private int mp;
	private int mga; // 魔法攻撃

	public String getmagicianName() {
		return name;
	}

	public void setmagicianName(String name) {
		if (name == null || name.length() < 3 || name.length() > 10) {
			throw new IllegalArgumentException("名前は3文字以上、10文字以下でnullはNGです。");
		}

		this.name = name;
	}

	public int getmagicianHp() {
		return hp;
	}

	public void setmagicianHp(int hp) {
		if (hp < 0) {
			hp = 0;
		}
		this.hp = hp;
	}

	public int getmagicianMp() {
		return mp;
	}

	public void setmagicianMp(int mp) {
		if (mp < 0) {
			mp = 0;
		}
		this.mp = mp;
	}

	public int getMagicAttack() {
		return mga;
	}

	public void setMagicAttack(int mga) {
		if(mga < 0) {
			mga = 0;
		}
		this.mga = mga;
	}

	public void strikingattack() {
		System.out.println(this.name + "の物理攻撃！");
		System.out.println("敵に1ダメージを与えた");
	}

	public void magicattack() {
		System.out.println(this.name + "の魔法攻撃！");
		System.out.println("敵に" + this.mga + "のダメージを与えた！");
		this.mp = this.mp - 1;
		System.out.println("魔法を使ったので" + this.mp + "に減った");
	}

	public void healingmagic() {
		System.out.println(this.name + "は回復魔法を使った");
		this.hp = this.hp + 10;
		System.out.println(this.name + "のHPは10回復して" + this.hp + "になった");

	}

	public void rest() {
		System.out.println(this.name + "は休憩をした");
		System.out.println("何もおこらなかった");
	}

	// 文字列が3文字以上、10文字以下でnullでないことをチェックするメソッド
	public boolean NameLangCheck() {
		return name != null && name.length() >= 3 && name.length() <= 10;

	}

}
