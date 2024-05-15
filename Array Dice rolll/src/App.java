import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        Random rand  = new Random();
        int[] outcomes = new int[13];
        int numrolls;
        int result;

        System.out.println("How many rolls (max 13)? ");
        numrolls = keys.nextInt();

        if (numrolls > 13){
            numrolls = 13;
        }
        else if (numrolls < 0){
            numrolls = 1;
        }
        
        for (int roll = 0; roll<numrolls; roll++){
            // nextint 0<= num < x
            result = (rand.nextInt(6)+1)+(rand.nextInt(6)+1);
            outcomes[roll] = result;
            System.out.println("Roll number " + roll + " is " + outcomes[roll]);
        }
    }
}
