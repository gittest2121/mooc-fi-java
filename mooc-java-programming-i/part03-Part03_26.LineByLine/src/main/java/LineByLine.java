
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            String[] text = input.split(" ");
            if (input.equals("")) {
                break;
            } else {
                for (String word : text) {
                    System.out.println(word);
                }
            }
        }
    }
}
