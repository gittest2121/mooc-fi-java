
import java.util.Collections;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdRegister register = new BirdRegister();

        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();
            
            if (command.equals("Quit")) {
                break;
            }
            
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                
                register.add(name, latinName);
                
            } else if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                
                if (register.search(name) != null) {
                    register.observe(register.search(name));
                } else {
                    System.out.println("Not a bird!");
                }
                
            } else if (command.equals("All")) {
                register.print();
            } else if (command.equals("One")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                
                System.out.println(register.search(name));
            }
        }
    }

}
