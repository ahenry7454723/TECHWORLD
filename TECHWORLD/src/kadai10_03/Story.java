package kadai10_03;

public class Story {

    public static void main(String[] args) {
        // 勇者のインスタンス生成
        Hero h = new Hero();
        h.setHeroName("勇者A");
        h.setHeroHp(150);  // HPが負の値で設定されていたのを正の値に修正
        h.setHeroAt(25);
        h.setHeroDf(20);

        // 魔法使いのインスタンス生成
        SuperMagician mag = new SuperMagician();
        mag.setmagicianName("魔法使いB");
        mag.setmagicianHp(200);
        mag.setmagicianMp(150);
        mag.setMagicAttack(25);

        // モンスターのインスタンス生成
        SuperMonster m = new SuperMonster(10, 3);  // 毒攻撃力と回数を設定
        m.setmonstertName("ドラゴン");
        m.setmonstertHp(500);
        m.setmonstertAt(70);
        m.setmonstertDf(60);

        // ストーリーの展開
        System.out.println("物語が始まる...");
        System.out.println(h.getHeroName() + "と" + mag.getmagicianName() + "は、危険な旅に出発した。");
        System.out.println("彼らは森の中で恐ろしい" + m.getmonstertName() + "に遭遇した。");

        // 戦闘シーン
        System.out.println("\n戦闘が始まった！");
        int heroAttack = h.getHeroAt();
        m.setmonstertHp(m.getmonstertHp() - heroAttack);
        System.out.println(m.getmonstertName() + "の残りHP: " + m.getmonstertHp());

        if (m.getmonstertHp() > 0) {
            mag.SuperAttackMagic();  // 魔法使いが超攻撃魔法を使用
            if (m.getmonstertHp() > 0) {
                m.atack();  // モンスターが攻撃
                h.setHeroHp(h.getHeroHp() - m.getmonstertAt());
                System.out.println(h.getHeroName() + "の残りHP: " + h.getHeroHp());
            }
        }

        // 戦闘結果
        if (m.getmonstertHp() <= 0) {
            System.out.println(h.getHeroName() + "と" + mag.getmagicianName() + "は、" + m.getmonstertName() + "を倒した！");
        } else {
            System.out.println(h.getHeroName() + "と" + mag.getmagicianName() + "は、" + m.getmonstertName() + "との戦いに敗れた...");
        }
    }
}
