package kadai10_03;

public class SuperHero extends Hero {
	
	public void Wattack() {
		System.out.println("2回攻撃!");
		System.out.println(super.getHeroName() + "のスーパー攻撃!");
		super.getHeroAt();
		super.getHeroAt();
		System.out.println("敵にダメージを" + super.getHeroAt() * 2  + "与えた");
	}
}