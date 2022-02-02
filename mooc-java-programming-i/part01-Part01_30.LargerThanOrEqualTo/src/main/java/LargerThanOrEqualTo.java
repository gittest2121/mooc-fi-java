
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = scan.nextInt();
        System.out.println("Give the second number:");
        int second = scan.nextInt();
        
        if (first > second) {
            System.out.println("Greater number is: " + first);
        } else if (first == second) {
            System.out.println("The numbers are equal!");
        } else {
            System.out.println("Greater number is " + second);
        }
    }
}
