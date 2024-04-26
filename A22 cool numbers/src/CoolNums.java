public class CoolNums {
    int num;
    int count;
    public CoolNums() {
        setnums(0);
    }
    public void setnums(int a){
        num = a;
    }
    public static boolean numsCalc(int a){
        if (a%3 == 1 && a%4 == 1 && a%5 == 1 && a%6 == 1){
            return true;
        }
        else{
            return false;
        }
    }
    public int count(){
        for (int i = 6; i <= num; i++){
            if (numsCalc(i) == true){
                count++;
            }
        }
        return count;
    }
    
}
