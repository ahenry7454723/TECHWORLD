package kadai06;

// 入力され計算された数値が4の倍数か否かを判断するクラス
public class ismul4 {
    public static String checkMultipleOf4(int sum) {
        if (sum % 4 == 0) {
            return "入力された数字の総和は4の倍数である";
        } else {
            return "入力された数字の総和は4の倍数ではない";
        }
    }
}
