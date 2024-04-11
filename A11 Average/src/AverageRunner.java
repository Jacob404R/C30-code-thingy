import java.util.Scanner;
public class AverageRunner {
    public static void main(String[] args) throws Exception {
        Scanner nums = new Scanner(System.in);
        Average calc = new Average();
        System.out.println("Please enter 2 numbers:");

        double num1 = nums.nextDouble();
        double nums2 = nums.nextDouble();
        calc.calculate(num1, nums2);
    }
}
