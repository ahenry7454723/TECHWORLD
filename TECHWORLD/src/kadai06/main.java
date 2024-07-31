package kadai06;

public class main {
    public static void main(String[] args) {
        int[] numbers = getnum.getNumbers();
        int sum = cal.calculateSum(numbers);
        String message = ismul4.checkMultipleOf4(sum);
        System.out.println(message);
    }
}
