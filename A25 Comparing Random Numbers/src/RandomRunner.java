import java.util.Scanner;
public class RandomRunner {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        RandomNums num = new RandomNums();

        System.out.println("How many pairs of random numbers do you want to output? ");
        int random = keys.nextInt();

        System.out.println("What do you want the maximum number to be? ");
        int max = keys.nextInt();

        num.setMax(max);
        num.looping(random);
    }
}
