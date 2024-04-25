public class LeapYear {
    int year = 0;

    public LeapYear(){
        setyear(0);
    }
    public void setyear(int a){
        year = a;
    }
    public boolean isLeapYear(){
        if (year%100 == 0){
            if (year%4 == 0&& year%400 == 0){
                return true;
            }
            else{
                return false;
            }
        }
        else if (year%4 == 0){
            return true;
        }
        else{
        return false;
        }
    }
}
