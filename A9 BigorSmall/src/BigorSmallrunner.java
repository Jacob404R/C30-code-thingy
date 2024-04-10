import java.util.Scanner;
public class BigorSmallrunner {
    public static void main(String[] args) throws Exception {
        Scanner num = new Scanner(System.in);
        
        BigorSmall numbers = new BigorSmall();
        Boolean trigger = true;
        while (trigger){

            System.out.println("Please enter 2 numbers");

            Integer num1 = num.nextInt();

            Integer num2 = num.nextInt();

            numbers.numCheck(num1,num2);

            System.out.println("Try again? (1)yes / (0)no");

            Integer yn = num.nextInt();

            if (yn == 0){
                trigger = !trigger;
            }
            else if (yn == 1){
                trigger = true;
            }
            else {
                System.out.println("That aint one of the options");
                trigger = !trigger;
            }
        }

    }
}
