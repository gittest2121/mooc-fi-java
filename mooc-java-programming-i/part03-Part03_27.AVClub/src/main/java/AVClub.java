
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            String[] text = input.split(" ");
            
            if (input.equals("")) {
                break;
            }
            for (String word : text) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }
    }
}
