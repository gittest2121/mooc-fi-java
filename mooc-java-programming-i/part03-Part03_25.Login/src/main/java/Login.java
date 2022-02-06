
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] users = {"alex", "emma"};
        String[] passwords = {"sunshine", "haskell"};
        
        
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        boolean login = false;
        for (int index = 0; index < users.length; ++index) {
            if (username.equals(users[index]) && password.equals(passwords[index])) {
                login = true;
            }
        }
        
        if (login) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
