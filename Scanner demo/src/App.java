import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //     Scanner keys = new Scanner(System.in);
    //     System.out.println("Scanner Demo Inputs");
    //     // int input
    //     System.out.println("Integers: ");
    //     int num = keys.nextInt();

    //     System.out.println("Number is " + num);

    //     // double input
    //     System.out.println("Double: ");
    //     double num2 = keys.nextDouble();

    //     System.out.println("Number is " + num2);

        
    //     // line input
    //     System.out.println("Enter: ");
    //     String input = keys.nextLine();

    //     System.out.println("Word is " + input);
    Scanner keys = new Scanner(System.in);
    

    System.out.print("Enter an integer: ");
    int num = keys.nextInt();
    keys.nextLine(); //clears console; forces new line

    System.out.print("Enter a Sentence: ");
    String sentence = keys.nextLine();
    System.out.println(num + " " + sentence);


     }
}
