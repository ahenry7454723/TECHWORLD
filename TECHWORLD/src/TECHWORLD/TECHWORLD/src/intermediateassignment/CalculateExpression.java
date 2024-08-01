package intermediateassignment;

import java.util.Stack;

public class CalculateExpression {
    /**
     * 数式を評価し、計算結果を返すメソッドです。
     * @param expression 評価する数式を含む文字列
     * @return 計算結果をdouble型で返す
     */
    public double evaluateExpression(String expression) {
        Stack<Double> values = new Stack<>(); // 数値を保存するためのスタック
        Stack<Character> operators = new Stack<>(); // 演算子を保存するためのスタック
        char[] tokens = expression.toCharArray(); // 入力された文字列を文字の配列に変換

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] == ' ') {
                continue;
            }
            if (tokens[i] >= '0' && tokens[i] <= '9') {
                StringBuilder sb = new StringBuilder();
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') {
                    sb.append(tokens[i++]);
                }
                i--; // インデックスの調整
                values.push(Double.parseDouble(sb.toString()));
                // 数字の後に直接括弧が来た場合、乗算として扱う
                if (i + 1 < tokens.length && tokens[i + 1] == '(') {
                    operators.push('*');
                }
            }
            else if (tokens[i] == '(') {
                operators.push(tokens[i]);
            }
            else if (tokens[i] == ')') {
                while (operators.peek() != '(') {
                    values.push(applyOperation(operators.pop(), values.pop(), values.pop()));
                }
                operators.pop(); // 開き括弧をスタックから削除
            }
            else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/' || tokens[i] == '×' || tokens[i] == '÷') {
                while (!operators.empty() && hasPrecedence(tokens[i], operators.peek())) {
                    values.push(applyOperation(operators.pop(), values.pop(), values.pop()));
                }
                operators.push(tokens[i]);
            }
        }

        // 式の末尾に到達した後、残った演算を実行
        while (!operators.empty()) {
            values.push(applyOperation(operators.pop(), values.pop(), values.pop()));
        }

        return values.pop(); // 最終的な計算結果を返す
    }

    private boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        return (op1 != '*' && op1 != '/') || (op2 != '+' && op2 != '-');
    }

    private double applyOperation(char op, double b, double a) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*':
            case '×': return a * b;
            case '/':
            case '÷': 
                if (b == 0) throw new UnsupportedOperationException("Cannot divide by zero");
                return a / b;
        }
        return 0;
    }
}
