import java.util.Scanner;
public class CoolNumsRunner {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        CoolNums cool  = new CoolNums();

        System.out.println("Please enter an okay number: ");
        int oknum = keys.nextInt();

        cool.setnums(oknum);

        System.out.println("There are " + cool.count() + " Cool numbers between 6 and " + oknum);

    }
}
