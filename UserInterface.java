import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;
    
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String userCommand = this.scanner.nextLine();
            
            if (userCommand.equals("stop")) {
                break;
            } else if (userCommand.equals("add")) {
                System.out.print("To add: ");
                todoList.add(this.scanner.nextLine());
            } else if (userCommand.equals("list")) {
                todoList.print();
            } else if (userCommand.equals("remove")) {
                System.out.print("Which one is removed? ");
                todoList.remove(Integer.valueOf(this.scanner.nextLine()));
            }
            System.out.println("Unknown command");
        }
    }
    
}
