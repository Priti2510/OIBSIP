import java.util.*;
public class GuessTheNumber {
    static Scanner sc = new Scanner(System.in);

    public static boolean findNumber(int round){

        int attempt = 10;
        int score = 100;
        boolean ans = false;

        Random random = new Random();
        int randomNumber = random.nextInt(99) +1;

        while(attempt>0 && !ans){
            System.out.println("Attempt " + (11-attempt)+"/10");
            System.out.println("Guess the Number : ");

            int guess = sc.nextInt();

            if (guess < randomNumber) {
                System.out.println("Little Low\n");
                attempt -= 1;
            } else if (guess > randomNumber) {
                System.out.println("Little High\n");
                attempt -= 1;
            } else {
                System.out.println("\nCongratulation you guess the number " + randomNumber + " in " + (11-attempt) + " guesses.");
                System.out.println("Your Score is " + attempt * 10 +"\n");

                System.out.println("************************\n");
                ans = true;
            }
        }
        if(attempt == 0){
            System.out.println("You lost the round no. "+ round +".");

            return false;
        }

        return true;
    }

    public static void main(String[] args) {

//        Game game = new Game();

        int round = 1;
        boolean isGameOn = true;

        System.out.println("Press 1 for Start");
        System.out.println("Press 2 for Exit");
        System.out.print("\nEnter Your choice: ");
        int i = sc.nextInt();

        System.out.println("************************\n");

        if(i == 1) {

            while(true) {
                System.out.println("Round " + round + " Start...\n");
                isGameOn = findNumber(round);

                if(isGameOn) {
                    System.out.println("Press 1 for Next Round");
                    System.out.println("Press 2 for Exit");
                    System.out.print("\nEnter Your choice: ");

                    int j = sc.nextInt();
                    if (j == 2) {
                        break;
                    }
                    round += 1;
                }else{
                    System.out.println("Game Over !");
                    break;
                }
            }
        }
    }
}