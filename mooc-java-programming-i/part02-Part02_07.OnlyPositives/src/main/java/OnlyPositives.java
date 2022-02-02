
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            
            if (num < 0) {
                System.out.println("Unsuitable number");
            } else if (num == 0) {
                break;
            } else {
                System.out.println(num*num);
            }
        }
        System.out.println("fsd");
    }
}