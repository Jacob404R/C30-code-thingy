import java.util.Scanner;
public class AreaofTriRunner {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);


        System.out.println("Please enter side a: ");
        double a = keys.nextDouble();
        
        System.out.println("Please enter side b: ");
        double b = keys.nextDouble();

        System.out.println("Please enter side c: ");
        double c = keys.nextDouble();

        AreaofTriangle calc = new AreaofTriangle();
        calc.setSides(a, b, c);
        calc.area();
    }
}
