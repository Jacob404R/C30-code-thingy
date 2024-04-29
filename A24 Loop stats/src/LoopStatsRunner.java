import java.util.Scanner;
public class LoopStatsRunner {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);

        LoopStats stats = new LoopStats();

        System.out.println("Please enter starting number:");
        int startnum = keys.nextInt();

        System.out.println("Please enter ending number:");
        int endnum = keys.nextInt();

        stats.setnums(startnum, endnum);
        System.out.println(stats.getStats());
    }
}
