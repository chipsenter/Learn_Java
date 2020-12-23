package javamasterclass.udemy;

public class Main {

    public static void main(String[] args) {

        double kilometeres = (100 * 1.609344);
        int highScore = 50;

        if(highScore == 50){
            System.out.println("This is an expression");
        }

        // Exemples on expressions
        int score = 100; // from score = 100 this forms the expression
        if (score > 99) {  // everything within the aprence are expressions
            System.out.println("You got the high score"); // again within aprence are the expressions
            score = 0; // score = 0 is the expression
        }
    }
}
