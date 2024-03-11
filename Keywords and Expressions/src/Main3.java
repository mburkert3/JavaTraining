public class Main3 {
    public static void main(String[] args) {
        calculateScore("Tim", 50);


    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + score + "points" );
        return score * 1000;
    }
}
