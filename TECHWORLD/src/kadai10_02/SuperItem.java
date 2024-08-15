package kadai10_02;
/**
 * エラーの原因
 *  Itemクラスには引数が必要なコンストラクタしかありません（public Item(int price)）。
 * ただ、SuperItemクラスにはコンストラクタが定義されておらず
 * 親クラスのコンストラクタを呼び出す方法がないためエラーになっている
 */
public class SuperItem extends Item{
	
	// サブクラスからスーパークラスのコンストラクタを明示的に呼び出す
	public SuperItem() {
		super(0);
	}
}
