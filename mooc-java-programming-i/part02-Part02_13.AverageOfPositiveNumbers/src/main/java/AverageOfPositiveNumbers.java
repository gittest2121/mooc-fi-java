
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = 0;
        int sum = 0;
        
        while (true) {
            int num = scanner.nextInt();
            
            if (num == 0) {
                break;
            } else if (num > 0) {
                ++numbers;
                sum += num;
            }
        }
        
        if (sum <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) sum/numbers);
        }
    }
}