
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> ages = new ArrayList<>();
        int count = 0;
        int sum = 0;
        String longestname = "";
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] words = input.split(",");
            ages.add(Integer.valueOf(words[1]));
            
            sum += ages.get(count);
            ++count;
            
            if (longestname.length() < words[0].length()) {
                longestname = words[0];
            }
        }
        
        System.out.println("Longest name: " + longestname);
        System.out.println("Average of the birth year: " + ((double) sum/count));
    }
}
