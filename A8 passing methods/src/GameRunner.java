import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);

        System.out.println("Do you want a (1) cat or (2) dog?");
        
        Integer input = keys.nextInt();

        Game animal = new Game();

        if (input == 1) {
            System.out.println("ok");
            animal.cat();
        }
        else if (input == 2){
            System.out.println("ok");
            animal.dawg();
        }
        else{
            System.out.println(":(");
            animal.no();
        }

    }
}
