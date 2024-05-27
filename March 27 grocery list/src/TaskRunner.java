import java.util.Scanner;

public class TaskRunner {
    public static void main(String[] args) throws Exception {
        Task chore = new Task();
        Scanner keys = new Scanner(System.in);

        System.out.println("Let's begin your grocery list!");
        boolean trigger = true;
        while(trigger){
            chore.addlist();

            chore.print("Do you want to add more? (1) no or (2) yes");
            int answer = keys.nextInt();
            if (answer == 1){
                trigger = false;
            }
            else if (answer > 2 || answer < 1){
                chore.print("That was not an option");
                trigger = false;
            }
        }
        chore.print("Here is your current list: ");
        chore.printList();

        chore.print("Do you want to edit the list? (1) no / (2) yes") ;
        int answer = keys.nextInt();
        if (answer == 2){
            chore.editList();
            chore.print("Here is your new list! ");
            chore.printList();
        }
        else if (answer == 1){
            chore.print("Here is your list: ");
            chore.printList();
        }
        else{
            chore.print("That was not an answer");
            chore.printList();
        }
    }
}
