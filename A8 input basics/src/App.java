import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        int intOne, intTwo; 
        double dubone, dubTwo;
  
        System.out.print("Enter an integer : ");
  
        intOne = keyboard.nextInt();
  
   
  
        System.out.print("Enter an integer : ");
  
        intTwo = keyboard.nextInt();
  
        System.out.print("Enter a decimal : ");
  
        dubone = keyboard.nextDouble();        
        
        System.out.print("Enter a decimal : ");
  
        dubTwo = keyboard.nextDouble();
  
        System.out.println("integer one = " + intOne);
  
        System.out.println("integer two = " + intTwo);

        System.out.println("Decimal two = " + intTwo);

        System.out.println("Decimal two = " + intTwo);

        System.out.println("Your integers equal to " + (intOne + intTwo));

        System.out.println("Your decimals equal to " + (dubone + dubTwo));
    }
}
