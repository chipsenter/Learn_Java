package javamasterclass.udemy;

public class Version5 {

    public static void main(String[] args) {

        int highScorePostion = calculateHighScorePosition(1000);
        displayHighScorePosition("Johan", highScorePostion);

        highScorePostion = calculateHighScorePosition(900);
        displayHighScorePosition("Sarah", highScorePostion);

        highScorePostion = calculateHighScorePosition(400);
        displayHighScorePosition("Emma", highScorePostion);

        highScorePostion = calculateHighScorePosition(50);
        displayHighScorePosition("Heidi", highScorePostion);

        highScorePostion = calculateHighScorePosition(500);
        displayHighScorePosition("Carol", highScorePostion);

        highScorePostion = calculateHighScorePosition(100);
        displayHighScorePosition("Tom", highScorePostion);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

//        if(playerScore >= 1000){
//            return 1;
//        } else if(playerScore >= 500) {
//            return 2;
//        } else if(playerScore >= 100) {
//            return 3;
//        }
//
//        return 4;
//    }
        int position = 4; // assuming position 4 will be returned
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}
