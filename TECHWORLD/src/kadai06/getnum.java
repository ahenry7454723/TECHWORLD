package kadai06;

import java.util.Scanner;
// 5つ以下の整数を標準入力として受け取る

public class getnum {
    public static int[] getNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("5つの整数を入力してください:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        return numbers;
    }
}

