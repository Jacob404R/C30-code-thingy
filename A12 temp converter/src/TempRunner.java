import java.util.Scanner;

public class TempRunner {
    public static void main(String[] args) throws Exception {
      TempCalc heat = new TempCalc();
      Scanner keys = new Scanner(System.in);
      
      System.out.println("Do you want to convert from (1) Celsius to Fahrenheit or (2) Fahrenheit to Celsius?");

      Integer answer = keys.nextInt();
      if (answer == 1){
        System.out.println("please enter the temperature in Celsius: ");
        double temp = keys.nextDouble(); 

        heat.celtoFah(temp); 
      }
      else if  (answer == 2){
        System.out.println("please enter the temperature in Fahrenheit: ");
        double temp = keys.nextDouble(); 

        heat.fahtoCel(temp); 
      }
      else{
        System.out.println("That wasn't 1 or 2.");
      }
    }
}
