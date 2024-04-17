import java.lang.Math;

public class AreaofTriangle {
    public void area(double a, double b, double c){
         double perimeter = a + b + c; 
         double s = perimeter/2; 
         double area = Math.sqrt(s*((s-a)*(s-b)*(s-c)));
         System.out.println("The area of the triangle is " + area + " units²");
    }
}
