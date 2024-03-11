public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000 && levelCompleted >= 6) {
            System.out.println("Your score was 5000");
        }

        else if ((score == 5000) && (levelCompleted >= 5)) {
            System.out.println("Your score = " + (score + bonus));
        }
        else {
            System.out.println("Game over");
        }

    }
}