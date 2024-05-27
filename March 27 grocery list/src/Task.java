import java.util.ArrayList;
import java.util.Scanner;

public class Task {
    static ArrayList<String> groceryList = new ArrayList<String>();

    Scanner keys = new Scanner(System.in);

    public void addlist(){
        print("How many items do you want to add?");
        int num = keys.nextInt();

        for (int i = 1; i <= num; i++){
            print("Please enter item: ");
            String item = keys.next();

            groceryList.add(item);
        }


    }
    
    public static void print(String a){
        System.out.println(a);
    }

    public void editList(){
        print("How many items do you want to edtit?");
        int listnum = keys.nextInt();
        printList();
        for (int i = 0; i < listnum; i++){
            print("Which item do you want to edit?");


    
            print("Please enter item number: ");
            int itemNum = keys.nextInt();
    
            print("Please enter new item: ");
    
            String newItem = keys.next();
    
            groceryList.set(itemNum, newItem);
        }

    }

    public static void printList(){
        for (int i = 0; i < groceryList.size(); i++){
            print("Position" + i + "is item:  " + groceryList.get(i)); // 
        }
    }
}