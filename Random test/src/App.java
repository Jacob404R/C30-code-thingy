import java.lang.Math;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int x = 10;

        int min = 1;
        int max = 6-min;
        while (x > 0){
            System.out.println(Math.round(min+ Math.random()*max )); //5 to 10
            x--;
        }
    }
}
