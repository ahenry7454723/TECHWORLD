package kadai11_02;

public class FirePokemon implements FireMonster{
	@Override
    public void attack() {
        System.out.println("炎ポケモンの通常攻撃！");
    }

    @Override
    public void deffence() {
        System.out.println("炎ポケモンの防御！");
    }

    @Override
    public void FireAttack() {
        System.out.println("炎ポケモンの炎攻撃！");
    }

	

}
