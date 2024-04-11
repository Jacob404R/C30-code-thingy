import java.util.Scanner;
public class SumUpRunner {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        SumUp adding = new SumUp();
        System.out.println("Please enter Real numbers");
        double n = keys.nextDouble();
        double n2 = keys.nextDouble();

        adding.PrintAnswer(n, n2, adding.Addnums(n, n2));

    }
}
