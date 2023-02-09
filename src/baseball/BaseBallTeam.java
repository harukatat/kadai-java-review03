package baseball;

public class BaseBallTeam {

        // フィールド
        private String Name;// 球団名
        private int Win;// 勝利数
        private int Lose;// 敗北数
        private int Draw;// 引き分け数

        //球団名
        public void setName(String Name) {
            this.Name = Name;
        }

        //勝利数

        public void setWin(int Win) {
            this.Win = Win;
        }

        //敗北数

        public void setLose(int Lose) {
            this.Lose = Lose;
        }

        //引き分け数

        public void setDraw(int Draw) {
            this.Draw = Draw;
        }

        // 勝率メソッド
        public double getRate() {
            double rate = (double) Win/(Win+ Lose);
           return rate;
         }

        // レポートメソッド
        public void report() {
            System.out.println (Name + "の2022年の成績は" + Win + "勝" + Lose + "負" + Draw + "分," + "勝率は" + getRate() + "です" );


        }
}