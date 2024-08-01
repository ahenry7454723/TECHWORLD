package kadai04;

// 各教科の「最高点、最高得点者、平均点」を出力するプログラム
// 合計点の「最高点、最高得点者、平均点」を出力するプログラム
public class kadai4_1 {

    public static void main(String[] args) {
        // 教科名の配列を作成
        String[] subjects = { "英語", "国語", "数学", "理科" };
        // 学生名の配列を作成
        String[] names = { "A", "B", "C" };
        // 各教科ごとの得点の2次元配列を作成
        int[][] scores = {
            { 92, 78, 95 }, // 英語の得点
            { 89, 79, 98 }, // 国語の得点
            { 98, 94, 89 }, // 数学の得点
            { 99, 86, 87 }  // 理科の得点
        };

        // 各教科の最高得点を格納する配列を作成
        int[] maxScores = new int[subjects.length];
        // 各教科の最高得点者を格納する配列を作成
        String[] topScorers = new String[subjects.length];
        // 各教科の平均点を格納する配列を作成
        double[] averageScores = new double[subjects.length];

        // 各教科について計算を行うループ
        for (int i = 0; i < subjects.length; i++) {
            // 各教科の得点の合計を初期化
            int sum = 0;
            // 最高得点を最初の学生の得点で初期化
            maxScores[i] = scores[i][0];
            // 最高得点者を最初の学生に初期化
            topScorers[i] = names[0];
            // 各学生について計算を行うループ
            for (int j = 0; j < names.length; j++) {
                // 合計点に現在の得点を加算
                sum += scores[i][j];
                // 現在の得点が最高得点を上回る場合、最高得点と得点者を更新
                if (scores[i][j] > maxScores[i]) {
                    maxScores[i] = scores[i][j];
                    topScorers[i] = names[j];
                }
            }
            // 平均点を計算
            averageScores[i] = (double) sum / names.length;
        }

        // 各教科の結果を出力
        System.out.println("各教科の[最高点、最高得点者、平均点]を以下に表示します。");
        // 各教科の結果を順に出力するループ
        for (int i = 0; i < subjects.length; i++) {
            // 各教科の最高点、最高得点者、平均点を出力
            System.out.println(subjects[i] + "の[最高点: " + maxScores[i] + ", 最高得点者: " + topScorers[i] + ", 平均点: " + averageScores[i] + "]");
        }

        // 各学生の合計点を格納する配列
        int[] totalScores = new int[names.length];
        // 合計点の最高得点を初期化
        int maxTotalScore = 0;
        // 合計点の最高得点者を初期化
        String topTotalScorer = "";
        // 平均合計点を初期化
        double averageTotalScore = 0;

        // 各学生について計算を行うループ
        for (int i = 0; i < names.length; i++) {
            // 各教科の得点を合計して合計点を計算
            for (int j = 0; j < subjects.length; j++) {
                totalScores[i] += scores[j][i];
            }
            // 現在の合計点が最高合計点を上回る場合、最高合計点と得点者を更新
            if (totalScores[i] > maxTotalScore) {
                maxTotalScore = totalScores[i];
                topTotalScorer = names[i];
            }
            // 平均合計点に現在の合計点を加算
            averageTotalScore += totalScores[i];
        }
        // 平均合計点を計算
        averageTotalScore /= names.length;

        // 合計点の結果を出力
        System.out.println("合計点の[最高点、最高得点者、平均点]を以下に表示します。");
        // 合計点の最高点、最高得点者、平均点を出力
        System.out.println("最高点: " + maxTotalScore + ", 最高得点者: " + topTotalScorer + ", 平均点: " + averageTotalScore);
    }
}
