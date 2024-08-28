package kadai11_02;

public class main {

	public static void main(String[] args) {
		// 雷ポケモンを生成
		ThunderPokemon thunderPokemon = new ThunderPokemon();
		thunderPokemon.attack();
		thunderPokemon.deffence();
		thunderPokemon.ThunderAttack();

		System.out.println("-----------------");

		// 炎ポケモンを生成
		FirePokemon firePokemon = new FirePokemon();
		firePokemon.attack();
		firePokemon.deffence();
		firePokemon.FireAttack();
		
		System.out.println("-----------------");
		
		// 雷炎ポケモンを生成
		ThunderFirePokemon thunderFirePokemon = new ThunderFirePokemon();
		thunderFirePokemon.attack();
		thunderFirePokemon.deffence();
		thunderFirePokemon.ThunderAttack();
		thunderFirePokemon.FireAttack();
	}

}
