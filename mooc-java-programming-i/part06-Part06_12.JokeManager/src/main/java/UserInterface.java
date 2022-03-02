
import java.util.Scanner;

public class UserInterface {
    private JokeManager manager;
    private Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
        
            String input = scanner.nextLine();
        
            if (input.equals("X")) {
                break;
            }
            
            int command = Integer.valueOf(input);
            
            if (command == 1) {
                System.out.println("Write a joke to be added:");
                String joke = scanner.nextLine();
                this.manager.addJoke(joke);
            } else if (command == 2) {
                System.out.println(this.manager.drawJoke());
            } else if (command == 3) {
                System.out.println("Printing the jokes.");
                this.manager.printJokes();
            }
        }
    }
}

