package intermediateassignment;

import java.util.Scanner;

public class getstr {
    /**
     * ユーザーから数式を入力として受け取り、文字列として返すメソッドです。
     * @return ユーザーが入力した数式を文字列として返します。
     */
    public String getstr() {
        Scanner scanner = new Scanner(System.in); // 標準入力からデータを読み取るためのScannerオブジェクト

        // ユーザーへの入力指示を表示
        System.out.println("数値と+、-、×、/、()の記号を用いて数式を入力してください:");
        System.out.println("最後に'end'と入力すると終了します。");

        StringBuilder result = new StringBuilder(); // 入力された数式を保存するためのStringBuilder
        while (true) {
            String input = scanner.nextLine(); // ユーザーからの入力を一行ずつ読み込む
            if (input.equalsIgnoreCase("end")) {
                break; // 'end'が入力されたらループを終了
            }
            result.append(input); // 入力された数式の一部をStringBuilderに追加
        }
        scanner.close(); // Scannerオブジェクトを閉じる
        return result.toString(); // 最終的に構築された数式を文字列として返す
    }
}
