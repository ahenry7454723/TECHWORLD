package kadai11_02;

public class ThunderPokemon implements ThunderMonster{
	
	@Override
    public void attack() {
        System.out.println("雷モンスターの通常攻撃！");
    }

    @Override
    public void deffence() {
        System.out.println("雷モンスターの防御！");
    }

    @Override
    public void ThunderAttack() {
        System.out.println("雷モンスターの雷攻撃！");
    }
}
