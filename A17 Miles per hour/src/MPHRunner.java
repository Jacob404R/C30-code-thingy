import java.util.Scanner;

public class MPHRunner {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        MPH rate = new MPH();

        System.out.println("Please enter the miles: ");

        double miles = keys.nextDouble(); 

        System.out.println("Please enter the hours: ");
        double hours = keys.nextDouble(); 

        System.out.println("Please enter the minutes: ");
        double minutes = keys.nextDouble(); 

        rate.setMph(miles, hours, minutes);
        rate.calcMPH();
        rate.print();
    }
}
