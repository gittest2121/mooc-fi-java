
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        int first = 0;
        int second = 0;
        final int MAX = 100;
        
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("First: " + first + "/" + MAX);
            System.out.println("Second: " + second + "/" + MAX);

            System.out.print("> ");
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                if (amount > 0) {    
                    first += amount;
                    
                    if (first > 100) {
                        first = 100;
                    }
                }
            }
            
            if (command.equals("move")) {
                
                if (amount > 0) {
                    if (amount > first) {
                        second += first;
                        first = 0;
                    } else {
                        second += amount;
                        first -= amount;
                    }
                    
                    if (second > 100) {
                        second = 100;
                    }
                }
            }
            
            if (command.equals("remove")) {
                if (second - amount >= 0 && amount > 0) {
                    second -= amount;
                }
            }
        }
    }

}
