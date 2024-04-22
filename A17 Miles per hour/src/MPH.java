import java.lang.Math;

public class MPH {
    double miles; 
    double hours;
    double minutes;
    public MPH(){
        setMph (0, 0, 0);
    }

    public void setMph(double m, double h, double min) {
        miles = m;
        hours = h;
        minutes = min;



    }
    public double calcMPH(){
        double hrs = hours + (minutes/60.0);
        double mph = miles/hrs;
        return Math.round(mph);
    }
    public void print(){
        System.out.println(miles +  " miles in " + hours + " hours and " +  minutes +  " minute equals to " +  calcMPH() + " MPH");
    }
}
