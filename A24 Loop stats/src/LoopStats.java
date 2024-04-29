public class LoopStats {
    int start, end;
    int total;
    int evencount;
    int oddcount;
    public LoopStats(){
        setnums(0, 0);
    }
    public void setnums(int a, int b) {
        start = a;
        end = b;
    }
    public int evenCount(){
        for (int i = start; i <= end; i++ ){
            if (i%2 == 0){
                evencount++;
            }
        }
        return evencount;
    } 
    public int oddCount(){
        for (int i = start; i <= end; i++ ){
            if (i%2 - 1 == 0){
                oddcount++;
            }
        }
        return oddcount;
    } 
    public int totalCount(){
        for (int i = start; i <= end; i++ ){
            total = total + i;
        }
        return total;
    } 
    public String getStats(){
        return "Stats between: " + start + " and " + end + "\nTotal = " + totalCount()  +  "\nEven count = " + evenCount() + "\nOdd count = " + oddCount();
    }
}
