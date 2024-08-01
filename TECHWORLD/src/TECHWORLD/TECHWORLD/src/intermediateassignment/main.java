package intermediateassignment;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculateExpression calculator = new CalculateExpression();

        System.out.println("数値と+、-、×、/、()の記号を用いて数式を入力してください:");

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if ("end".equalsIgnoreCase(input)) {
                break;
            }
            double result = calculator.evaluateExpression(input.replace('×', '*').replace('÷', '/'));
            System.out.println("計算結果: " + result);
        }

        scanner.close();
    }
}
