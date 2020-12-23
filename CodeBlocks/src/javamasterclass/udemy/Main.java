package javamasterclass.udemy;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score < 4000 && score > 1000) {
//            System.out.println("Your score was 5000");
//        } else if(score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }


        if(gameOver) {
            int newScore = score + 9200;
            int newLevelCompleted = levelCompleted + 3;
            int newBonus = bonus * 2;
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Exemple 1: Your new final was " + finalScore );
        }

        // Redefined above Variables
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Exemple 2: Your final score was " + finalScore);
        }


    }
}
