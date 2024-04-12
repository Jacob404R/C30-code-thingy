public class TempCalc {
    public void celtoFah(double c1){
        double fah = c1*(9.0/5)+32;
        System.out.println(c1 +  "°F is equal to " + fah + "°C");
    }

    public void fahtoCel(double f1){
        double cel = (f1-32)*(5.0/9);
        System.out.println(f1 +  "°F is equal to " + cel + "°C");
    }
}
