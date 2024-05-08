import java.util.Scanner;

public class Pig {
    int playersum; // value for player's roll the entire game
    int pcsum;
    int diceroll;
    int totalroll = 0; // value for player's roll sum in one round

    private static Scanner keys = new Scanner(System.in);

    public int dice(){
        diceroll = (int) (Math.round(1+ Math.random()*6)); // dices from 1 to 6
        return diceroll;
    }
    public void game(){
        int round = 1;
        print("Welcome to pig rpg. First to get to 100 wins. Press enter for the next line. ");
        print("During your turn, you can roll as many times as you want"); 
        print("IF it turns to 1, then nothing is added and your turn is forfeit"); // instructions and welcome page
        while (playersum < 100 || pcsum < 100){ // plays until a winner is called
            print("Round " + round + "."); // counts the rounds
            print("Computer: These are my rolls"); // computer round
            pcroll();
            print("This is my total: " + pcsum);
            print("Your turn.");

            playerroll(); // player round
            print("This is your current total: " + playersum);

            print("Here is the computer's total: " + pcsum);

            round++;

        }
        print("The round has ended. \nThe winner is :");

        if (playersum >= 100){ // determines a winner
            print("YOU");
        }
        else{
            print("The computer :(");
        }

    }

    public void playerroll(){
    boolean trigger = true;
 // keeps player's round going
        int x = 0;
        while (trigger && playersum < 100){ // keeps player round going until they hit 100 or they roll a 1
            System.out.println("How many times do you want to roll?" );
            x = keys.nextInt();
            keys.nextLine();

            for (int i = 0; i <x; i++){ // rolls the amount of times the player inputs
                int roll = dice();

  

                if (roll != 1){
                    printint(roll);
                    totalroll = totalroll+roll;
                }

                else{
                    printint(roll);
                    print("You rolled a 1! No points rewarded");
                    i = x;
                    totalroll = 0;
                    trigger = false;


                }
            }
            playersum = totalroll + playersum;
            totalroll = 0; // resets total roll back to 0

            print("This is your current total: " + playersum);
            if (trigger){ //atops asking if the trigger is false
                  System.out.println ("Roll again? (1) yes or (2) no");
                   int trig = keys.nextInt();

                if(trig == 2){                // trigger if player wants to keep going, ends round if they input anything else
                 trigger = false;;
             }

                else if(trig == 1){
                 trigger = true;
              }
             else{
                 System.out.println("That was not an option, forfeiting turn");
                 trigger = false;
             }
        }
        }


    }
    public void pcroll(){ 
        for (int i = 0; i < 3; i++){ // loops 3 times
            int x = dice();
            printint(x);
            pcsum = pcsum + x;
        }

        
    }

    public static void print(String x){ // simplified printing for strings
        System.out.println(x);
        System.out.println("Press enter to continue");
        keys.nextLine();
    }
    public static void printint(int x){ // simplified printing for integers
        System.out.println(x); 
        keys.nextLine();
    }

}

