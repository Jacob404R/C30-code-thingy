import java.util.Scanner;

public class Pig {
    int playersum;
    int pcsum;
    int diceroll;

    Scanner keys = new Scanner(System.in);
    public void getResponse(){

    }
    public int dice(){
        diceroll = (int) (Math.round(1+Math.random()*5)); // dices from 1 to 6, 1 is the minimum; 6 (5+1) is max
        return diceroll;
    }
    public void game(){
        int round = 1;
        print("Welcome to pig rpg. First to get to 100 wins. \nDuring your turn, you can roll as many times as you want \nIF it turns to 1, then nothing is added and your turn is forfeit \n");
        while (playersum < 100 || pcsum < 100){
            print("Round " + round + ".");
            print("Computer: These are my rolls");
            pcroll();
            print("This is my total");
            printint(pcsum);
            print("");
            print("Your turn.");

            playerroll();
            print("This is your current total: ");
            printint(playersum);
            print("Here is the computer's total: ");
            printint(pcsum);

            round++;

        }
        print("The round has ended. \nThe winner is :");

        if (playersum >= 100){
            print("YOU");
        }
        else{
            print("The computer :(");
        }

    }
    public void playerroll(){
        boolean trigger = true; // keeps player's round going
        int x;
        int totalroll = 0;
        while (trigger && totalroll <100){
            print("How many times do you want to roll?");
            x = keys.nextInt();

            for (int i = 0; i <=x; i++){ // rolls the amount of times the player inputs
                int roll = dice();
  

                if (roll != 1){
                    printint(roll);
                    totalroll = totalroll+roll;
                }

                else{
                    trigger = false;
                    totalroll = 0;
                }
            }
            playersum = totalroll + playersum;
            print("This is your current total: ");
            printint(playersum);
            print("Roll again? (1) yes or (2) no");
            int trig = keys.nextInt();

            if(trig == 2){                
                trigger = false;
            }

            else if(trig == 1){
                trigger = true;
            }
            else{
                print("That was not an option, forfeiting turn");
                trigger = false;
            }
        }
        playersum = totalroll; // putting it at the ends adds all rolls and doesn't add anything if roll is 1


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
    }
    public static void printint(int x){ // simplified printing for integers
        System.out.println(x); 
    }

}

