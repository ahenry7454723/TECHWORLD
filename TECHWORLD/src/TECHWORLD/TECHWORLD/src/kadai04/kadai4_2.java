package kadai04;

public class kadai4_2 {

    public static void main(String[] args) {
        System.out.println("名前（A,B,C）と教科名（英語、国語、数学、理科、全教科）を1つずつ選択して入力してください。");
        System.out.println("A,B,Cから選択して入力してください。");
        String name_select = new java.util.Scanner(System.in).nextLine();
        System.out.println("英語、国語、数学、理科、全教科から選択してください");
        String subjects_select = new java.util.Scanner(System.in).nextLine();

        // 教科名の配列を作成
        String[] subjects = { "英語", "国語", "数学", "理科" ,"全教科"};
        // 学生名の配列を作成
        String[] names = { "A", "B", "C" };
        // 各教科ごとの得点の2次元配列を作成
        int[][] scores = {
                { 92, 78, 95 }, // 英語の得点
                { 89, 79, 98 }, // 国語の得点
                { 98, 94, 89 }, // 数学の得点
                { 99, 86, 87 }  // 理科の得点
        };

        // 入力された教科のインデックスを取得
        int subjectIndex = -1;
        for (int i = 0; i < subjects.length; i++) {
            if (subjects_select.equals(subjects[i])) {
                subjectIndex = i;
            }
        }

        // 最高得点と最高得点者を特定
        int maxScore = scores[subjectIndex][0];
        String topScorer = names[0];
        for (int j = 1; j < names.length; j++) {
            if (scores[subjectIndex][j] > maxScore) {
                maxScore = scores[subjectIndex][j];
                topScorer = names[j];
            }
        }

        // 入力された名前のインデックスを取得
        int studentIndex = -1;
        for (int i = 0; i < names.length; i++) {
            if (name_select.equals(names[i])) {
                studentIndex = i;
            }
        }

        // 結果を出力
        if (names[studentIndex].equals(topScorer)) {
            System.out.println("あなたは " + subjects_select + " で最高得点者です。");
        } else {
            int difference = maxScore - scores[subjectIndex][studentIndex];
            System.out.println(subjects_select + " の最高得点者ではありません。最高得点まであと " + difference + " 点足りません。");
        }
    }
}
