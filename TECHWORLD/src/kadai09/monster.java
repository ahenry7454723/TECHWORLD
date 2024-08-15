package kadai09;

public class monster {
	// フィールド
	private String name;  // 名前(3文字以上、10文字以下でnullはNG)
	private int hp; // HP 
	private int at; // 攻撃力
	private int df; // 防御力
	
	
	
	public String getmonstertName() {
		return name;
	}

	public void setmonstertName(String name) {
		if(name == null) {
			throw new IllegalArgumentException("名前は3文字以上、10文字以下でnullはNGです。");
		}
		this.name = name;
	}

	public int getmonstertHp() {
		return hp;
	}

	public void setmonstertHp(int hp) {
		if (hp < 0) {
			hp = 0;
		}
		this.hp = hp;
	}

	public int getmonstertAt() {
		return at;
	}

	public void setmonstertAt(int at) {
		if(at <0) {
			at = 0;
		}

		this.at = at;
	}

	public int getmonstertDf() {
		return df;
	}

	public void setmonstertDf(int df) {
		if(df <0) {
			df = 0;
		}
		this.df = df;

		this.df = df;
	}

	public void atack() {
		System.out.println(this.at+"の攻撃");
		System.out.println(this.at+"のダメージ");
	}
	
	public void defense() {
		System.out.println(this.name+"は守りを固めた");
		this.df = this.df+10;
		System.out.println("防御力が10上がった");
	}
	
	// 文字列が3文字以上、10文字以下でnullでないことをチェックするメソッド
	public  boolean NameLangCheck() {
		return name != null && name.length() >= 3 && name.length() <= 10;
			
		}

}
