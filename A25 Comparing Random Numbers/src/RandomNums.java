import java.lang.Math;

public class RandomNums {
    double a;
    double b;
    int count = 1;
    int max;
    public void setMax(int z){
        max = z+1;
    }
    public void setNums(){
        a = Math.round(Math.random()*max);
        b = Math.round(Math.random()*max);
    }
    public void greatorless(){
        System.out.println(count + ". Here are two random numbers: " + a + " and " + b);
        if (a > b){
            System.out.println(b + " is the smaller number\n" + a + " is the bigger number \n");
        }
        else if (b > a){
            System.out.println(a + " is the smaller number\n" + b + " is the bigger number\n");
        }
        else {
            System.out.println(a + " and " + b + " are equal \n");
        }
    }
    public void looping(int c){
        for (int i = 0 ; i <c; i++){
            setNums();
            greatorless();
            count++;
        }
    }
}
