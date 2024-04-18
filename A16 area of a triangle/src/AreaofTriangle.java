import java.lang.Math;

public class AreaofTriangle {

    private double sA, sB, sC;
    private double area;
    private double perimeter;


    public AreaofTriangle(){
        setSides(0,0,0);

    }
    public void setSides(double a, double b, double c){
        sA = a;
        sB = b;
        sC = c;
    }
    public double pmeter(){
        perimeter = sA + sB + sC;
        return perimeter;
    }
    public void area(){
         double s = pmeter()/2.0;
         area = Math.sqrt(s*((s-sA)*(s-sB)*(s-sC)));
         System.out.println("The perimeter of the triangle is " + pmeter() + " units \n The area is " + String.format("%.5f", area) + " units²");
    }
}
