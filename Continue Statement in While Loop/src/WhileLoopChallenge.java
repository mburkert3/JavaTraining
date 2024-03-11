public class WhileLoopChallenge {
    public static void main(String[] args) {
        int j = 5;
        while (j <= 20) {
            if (isEvenNumber(j)) {
                System.out.println(j);
                j++;
            }
        }
        }
    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }


    }


