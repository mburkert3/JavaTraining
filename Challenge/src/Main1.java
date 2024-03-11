public class Main1 {
    public static void main(String[] args) {

        int highScore = calculateHighScorePosition(1500);

        displayHighScorePosition("Matt", highScore);

        highScore = calculateHighScorePosition(999);
        displayHighScorePosition("Tim", highScore);

        highScore = calculateHighScorePosition(499);
        displayHighScorePosition("Zaac", highScore);

        highScore = calculateHighScorePosition(99);
        displayHighScorePosition("Percy", highScore);

        highScore = calculateHighScorePosition(-100);
        displayHighScorePosition("Rob", highScore);


    }


    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get " + position + " place");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 0;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;

    }
}

