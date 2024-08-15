package kadai10_01;

public class EvolvedPokemon extends Pokemon {
	public int heel; // 回復

	public void Wattack() {
		System.out.println("2回攻撃！");
		super.PokemonAttack(); // 親クラスの攻撃メソッドを1回目の攻撃として呼び出す
		super.PokemonAttack(); // 親クラスの攻撃メソッドを2回目の攻撃として呼び出す
	}

	public void Heel() {
		System.out.println("回復した!");
	}
}
