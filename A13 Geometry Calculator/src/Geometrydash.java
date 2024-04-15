import java.util.Scanner;

public class Geometrydash {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);

        Geocalc calc = new Geocalc();

        System.out.println("Do you want to a Rectangle's perimeter? (1), a Cube's surface area? (2), or a Circle's area? (3) ");

        int answer = keys.nextInt();


        if (answer == 1){
            System.out.println("Please enter length:");
            double l = keys.nextDouble();

            System.out.println("");

            System.out.println("Please enter width:");
            double w = keys.nextDouble();

            calc.rectPerimeter(l, w);
        }
        else if (answer == 2){
            System.out.println("Please enter side length:");
            double s = keys.nextDouble();

            calc.surfareaCube(s);
        }
        else if (answer == 3){
            System.out.println("Please enter radius:");
            double r = keys.nextDouble();
            
            calc.areaCircle(r);
        }
        else {
            System.out.println("that wasn't an option");
    }
    }
}
