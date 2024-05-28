import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Thread;

public class Raffle {

    ArrayList<String> raffleGroup = new ArrayList<String>();

    Scanner keys =  new Scanner(System.in);
    int count = 1;
    public void winner() throws InterruptedException{
         while (raffleGroup.size() > 1){



            for (int i =0; i < raffleGroup.size(); i++){
                print("\nDraw " + (count));
                Thread.sleep(1000);
                if (raffleGroup.size() > 1){ // ensures that it doesn't pick the last name
                    rafflePick();
                    count++;
                    Thread.sleep(1000);
                    print("\nHere are the remaining players: ");
                    Thread.sleep(1000);
                    listPrint();
                }
            }
        }
        print(raffleGroup.get(0) + " Remains! THEY ARE THE WINNER!");
    }

    public void setUp() throws InterruptedException{
        Thread.sleep(1000);
        print("How many names do you want to add?");
        int numNames = keys.nextInt();

        print("Please enter the names: ");

        for (int i = 0; i < numNames; i++){
            String names = keys.next();
            names(names); // sets up list
        }
    }
    public void rules() throws InterruptedException{ // explains the rules
        print("Welcome to Reverse Raffle draw!" );
        Thread.sleep(1000);
        print("Each turn, a name is drawn from your list");
        Thread.sleep(1000);
        print("That name will be remove.");
        Thread.sleep(1000);
        print("Last name in list wins!");
        
    }

    public void rafflePick() throws InterruptedException{ // generates a random number to pick in raffle
        int pick = (int) Math.round(Math.random()*(raffleGroup.size()-1));
        print(raffleGroup.get(pick) + " was picked! They are out");
        raffleGroup.remove(pick);
        Thread.sleep(1000);


    }



    public void print(String thing){
        System.out.println(thing);  
    }

    public void names(String a){
        raffleGroup.add(a);

    }
    public void listPrint() throws InterruptedException{
        for(int i = 0; i < raffleGroup.size(); i++){
            print(raffleGroup.get(i));
            Thread.sleep(1000);
        }
    }
    
}
