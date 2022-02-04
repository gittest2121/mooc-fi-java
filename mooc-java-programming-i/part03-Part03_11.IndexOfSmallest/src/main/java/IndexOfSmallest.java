
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int num = scanner.nextInt();
            if (num == 9999) {
                break;
            }
            list.add(num);
        }
        
        int smallest = list.get(0);
        for (int i = 0; i < list.size(); ++i) {
            if (smallest > list.get(i)) {
                smallest = list.get(i);
            }
        }
        
        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
