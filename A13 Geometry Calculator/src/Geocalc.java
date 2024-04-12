public class Geocalc {
    double pi = 3.14159265359;
        

    
    public void rectPerimeter(double L, double W){
        double P = 2*(L+W);
        System.out.println("The perimeter of the rectangle is " + P + "units");
    }
    public void surfareaCube(double side){
        double SA = 6*(side*side);
        System.out.println("The surface area of the cube is " + SA + "units²");
    }
    public void areaCircle(double rad){
        double A = pi*(rad*rad);
        System.out.println("The area of the circle is " + A + "units²");
    }

    public void calc(int answer){
        if (answer == 1){
            rectPerimeter(answer, answer);
        }
        else if (answer == 2){
            surfareaCube(answer);
        }
        else if (answer == 3){
            areaCircle(answer);
        }
        else {
            System.out.println("that wasn't an option");
        }
    }
}
