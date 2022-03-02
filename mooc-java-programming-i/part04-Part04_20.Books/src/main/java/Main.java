import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        Scanner scanner = new Scanner(System.in);
        
        // Adding Book object to list
        ArrayList<Book> books = new ArrayList<>();
        
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, year));
        }
        
        System.out.print("What information will be printed?");
        String printwhat = scanner.nextLine();
        
        for (Book out : books) {
            if (printwhat.equals("everything")) {
                System.out.println(out);
            } else if (printwhat.equals("name")) {
                System.out.println(out.getTitle());
            }
        }
    }
}
