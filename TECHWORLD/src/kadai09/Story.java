package kadai09;

public class Story {

	public static void main(String[] args) {

		Hero h = new Hero();
		h.setHeroName("勇者A");
		h.setHeroHp(-150);
		h.setHeroAt(25);
		h.setHeroDf(20);

		System.out.println("勇者が誕生した");
		System.out.println("名前:" + h.getHeroName());
		System.out.println("体力:" + h.getHeroHp());
		System.out.println("攻撃力:" + h.getHeroAt());
		System.out.println("防御力:" + h.getHeroDf());

		monster m = new monster();
		m.setmonstertName("ドラゴン");
		m.setmonstertHp(500);
		m.setmonstertAt(70);
		m.setmonstertDf(60);
		System.out.println("モンスターが誕生した");

		System.out.println("名前:" + m.getmonstertName());
		System.out.println("体力:" + m.getmonstertHp());
		System.out.println("攻撃力:" + m.getmonstertAt());
		System.out.println("防御力:" + m.getmonstertDf());

		magician mag = new magician();
		mag.setmagicianName("魔法使い");
		mag.setmagicianHp(200);
		mag.setmagicianMp(150);
		System.out.println("魔法使いが誕生した");
		System.out.println("名前:" + mag.getmagicianName());
		System.out.println("体力:" + mag.getmagicianHp());
		System.out.println("攻撃力:" + mag.getmagicianMp());

		// 発展問題(簡単なストーリー)
		System.out.println(h.getHeroName() + "と" + mag.getmagicianName() + "の物語は始まった!");
		System.out.println(h.getHeroName() + "と" + mag.getmagicianName() + "は、危険な旅に出発した。");
		System.out.println("彼らは森の中で恐ろしい" + m.getmonstertName() + "に遭遇した。");

		System.out.println("\n戦闘が始まった！");
		h.getHeroAt();
		m.setmonstertHp(m.getmonstertHp() - h.getHeroAt());
		System.out.println(m.getmonstertName() + "の残りHP: " + m.getmonstertHp());

		if (m.getmonstertHp() > 0) {
			m.getmonstertAt();
			h.setHeroHp(h.getHeroHp() - m.getmonstertAt());
			System.out.println(h.getHeroName() + "の残りHP: " + h.getHeroHp());

			m.setmonstertHp(0);
			System.out.println(m.getmonstertName() + "の残りHP: " + m.getmonstertHp());
		}

		if (m.getmonstertHp() <= 0) {
			System.out.println(h.getHeroName() + "と" + mag.getmagicianName() + "は、" + m.getmonstertName() + "を倒した！");
		} else {
			System.out
					.println(h.getHeroName() + "と" + mag.getmagicianName() + "は、" + m.getmonstertName() + "との戦いに敗れた...");
		}

	}
}
