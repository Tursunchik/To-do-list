
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Task> todoList = new ArrayList<>();

        while (true) {
            System.out.println("\n--- TO-DO LIST ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark as finished task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            if (sc.hasNextInt()) {
                int choice = sc.nextInt();
                sc.nextLine();

                if (choice == 1) {
                    System.out.print("Enter Description: ");
                    String desc = sc.nextLine().trim();

                    if (desc.trim().isEmpty()) {
                        System.out.println("Invalid Description!");
                    } else if (desc.length() > 100) {
                        System.out.println("Description too long! Maximum 100 characters.");
                    } else if (!desc.matches(".*[a-zA-Z].*")) {
                        System.out.println("Description must contain at least one letter!");
                    }else {
                        todoList.add(new Task(desc));
                        System.out.println("Task added successfully!");
                    }

                } else if (choice == 2) {
                    if (todoList.isEmpty()) {
                        System.out.println("Your task list is empty!");
                    } else {
                        System.out.println("\n--- YOUR TASKS ---");
                        for (int i = 0; i < todoList.size(); i++) {
                            System.out.println((i + 1) + ". " + todoList.get(i));
                        }
                    }

                } else if (choice == 3) {
                    if (todoList.isEmpty()) {
                        System.out.println("There are no tasks to update!");
                    } else {
                        System.out.print("Enter the task number to mark as finished: ");

                        if (sc.hasNextInt()) {
                            int index = sc.nextInt();
                            sc.nextLine();

                            if (index >= 1 && index <= todoList.size()) {
                                todoList.get(index - 1).markDone();
                                System.out.println("Task updated successfully!");
                            } else {
                                System.out.println("Invalid task number!");
                            }
                        } else {
                            System.out.println("Please enter a valid number!");
                            sc.nextLine();
                        }
                    }

                } else if(choice == 4) {
                    System.out.println("Enter description of task you want to delete: ");
                    String descDelete = sc.nextLine().trim();
                    boolean found = false;

                    for(int i = 0; i < todoList.size(); i++){
                        if(todoList.get(i).getDescription()
                                .equalsIgnoreCase(descDelete)){
                            todoList.remove(i);
                            System.out.println("Task deleted successfully!");
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Task not found!");
                    }

                }else if (choice == 5) {
                    System.out.println("Goodbye!");
                    break;

                } else {
                    System.out.println("Wrong choice! Please select 1, 2, 3, or 4.");
                }

            } else {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
            }
        }

        sc.close();
    }
}
