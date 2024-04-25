import java.util.Scanner;
public class LeapYearRunner {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);

        LeapYear year = new LeapYear();

        System.out.println("Please enter the year:");
        int year1 = keys.nextInt();
        year.setyear(year1);
        if (year.isLeapYear() == true){
            System.out.println("The year " + year1 + " is a leap year");
        }
        else{
            System.out.println("The year " + year1 + " is not a leap year");
        }

    }
}
