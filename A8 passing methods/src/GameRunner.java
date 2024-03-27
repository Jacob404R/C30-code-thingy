import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);

        System.out.println("Do you want a (1) cat or (2) dog?");
        
        Integer input = keys.nextInt();

        Game cat = new Game();

        if (input == 1) {
            System.out.println("ok");
            cat.cat();
        }
        else if (input == 2){
            System.out.println("ok");
        }
        else{
            System.out.println(":(");
        }

    }
}
