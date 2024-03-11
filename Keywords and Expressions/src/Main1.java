public class Main1 {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The highscore is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        System.out.println("The next high score is " +
                calculateScore(gameOver, score, levelCompleted, bonus));
    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;

        }
        return finalScore;

    }

    public static int displayHighScorePosition(String name, int position) {
        System.out.println("Matt managed to get 2nd place");
    }


    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        }
        if (score >= 500 && score < 1000) {
            return 2;
        }
        if (score >= 100 && score < 500) {
            return 3;
        }
        return 4;

    }
}