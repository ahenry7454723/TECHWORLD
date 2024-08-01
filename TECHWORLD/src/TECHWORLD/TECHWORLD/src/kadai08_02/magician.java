package kadai08_02;

public class magician {
	String name;
	int hp;
	int mp;

	void strikingattack() {
		System.out.println(this.name + "の物理攻撃！");
		System.out.println("敵に1ダメージを与えた");
	}

	void magicattack() {
		System.out.println(this.name + "の魔法攻撃！");
		System.out.println("敵に" + "10のダメージを与えた！");
		this.mp = this.mp - 1;
		System.out.println("魔法を使ったので" + this.mp + "に減った");
	}

	void healingmagic() {
		System.out.println(this.name + "は回復魔法を使った");
		this.hp = this.hp + 10;
		System.out.println(this.name + "のHPは10回復して" + this.hp + "になった");

	}

	void rest() {
		System.out.println(this.name + "は休憩をした");
		System.out.println("何も怒らなかった");
	}
}
