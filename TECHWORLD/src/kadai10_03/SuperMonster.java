package kadai10_03;

public class SuperMonster extends monster {
    private int poisonAttack; // 毒攻撃力
    private int poisonAttackLimit; // 毒攻撃の限界回数
    private int poisonAttackCount; // 毒攻撃の実施回数カウンタ

    public SuperMonster(int poisonAttack, int poisonAttackLimit) {
        this.poisonAttack = poisonAttack;
        this.poisonAttackLimit = poisonAttackLimit;
        this.poisonAttackCount = 0;
    }

    @Override
    public void atack() {
        super.atack(); // 親クラスの攻撃メソッドを呼び出す

        // 毒攻撃がまだ限界回数に達していない場合、毒攻撃を行う
        while (poisonAttackCount < poisonAttackLimit) {
            System.out.println("さらに毒攻撃！");
            System.out.println(poisonAttack + "の追加ダメージ！");
            poisonAttackCount++; // 毒攻撃カウンタを増やす
        }
    }

    // 毒攻撃力を取得するメソッド
    public int getPoisonAttack() {
        return poisonAttack;
    }

    // 毒攻撃力を設定するメソッド
    public void setPoisonAttack(int poisonAttack) {
        if (poisonAttack < 0) {
            this.poisonAttack = 0;
        } else {
            this.poisonAttack = poisonAttack;
        }
    }
}
