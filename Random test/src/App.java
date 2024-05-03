import java.lang.Math;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int x = 10;

        int min = 10;
        int max = 20-min;
        while (x > 0){
            System.out.println(Math.round(min+ Math.random()*max )); //5 to 10
            x--;
        }
    }
}
