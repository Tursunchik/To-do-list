import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        ArrayList<Task>  todoList = new ArrayList<>();
        while(true){
            System.out.println("\n--- TO-DO LIST ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark as finished task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");


            int choice = sc.nextInt();
            sc.nextLine();
            if(choice == 1){
                System.out.print("Enter Description: ");
                String desc = sc.nextLine();
                todoList.add(new Task(desc));
            } else if(choice == 2){
                for(int i = 0; i < todoList.size(); i++){
                    System.out.println(i + "." + todoList.get(i));
                }
            } else if(choice == 4){
                break;
            } else if(choice == 3){
                System.out.println("Enter the task number to mark as finished: ");
                int index = sc.nextInt();
                sc.nextLine();

                if(index >= 0 && index < todoList.size()){
                    todoList.get(index).markDone();
                    System.out.println("Task updated successfully!");
                }
            } else {
                System.out.println("Wrong choice!");

            }
        }
    }
}
