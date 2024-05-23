import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
       
        String[] namesArray = new String[10];

        List<String> namesList = new ArrayList<String>();

        namesList.add("e"); 
        namesList.add("a");

        namesList.add(0,"re");

        System.out.println(namesList);

        System.out.println(namesList.size());
        System.out.println(namesList.get(2));





        List numList = new ArrayList();

        numList.add(4);

        numList.add(0,7);

        System.out.println(numList);

        System.out.println(numList.size());
    }
}
