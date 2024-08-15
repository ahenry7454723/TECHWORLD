package kadai10_03;

public class SuperMagician extends magician {

	public void SuperAttackMagic() {
        if (this.getmagicianMp() >= 2) {  // MPが2以上あるか確認
            System.out.println(getmagicianName() + "の超攻撃魔法!");
            int damage = getMagicAttack() * 2;  // 魔法攻撃の2倍のダメージ
            System.out.println("敵にダメージを" + damage + "与えた");

            int currentMp = getmagicianMp() - 2;  // MPを2消費
            setmagicianMp(currentMp);  // 更新されたMPをセット
            System.out.println(getmagicianName() + "のMPは" + getmagicianMp() + "に減った");
        } else {
            System.out.println(getmagicianName() + "のMPが不足していて超攻撃魔法が使えません！");
        }
	}

}
