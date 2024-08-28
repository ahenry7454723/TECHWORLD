package kadai11_02;

public class ThunderFirePokemon implements ThunderMonster,FireMonster{
	@Override
    public void attack() {
        System.out.println("雷炎ポケモンの通常攻撃！");
    }

    @Override
    public void deffence() {
        System.out.println("雷炎ポケモンの防御！");
    }

    @Override
    public void ThunderAttack() {
    	System.out.println("雷炎ポケモンの雷攻撃！");
    }
    
    @Override
    public void FireAttack() {
        System.out.println("雷炎ポケモンの炎攻撃！");
    }
	

}
