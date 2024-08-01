package kadai06;

// 計算処理をおこなうクラス
public class cal {
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        
        for (int number : numbers) {
            sum += number;
        }
        
        return sum;
    }
}

