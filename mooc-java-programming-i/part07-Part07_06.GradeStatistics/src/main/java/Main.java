	 
	import java.util.Scanner;
	 
	public class Main {
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        GradeStatistics distribution = new GradeStatistics();
	        
	        System.out.println("Enter point totals, -1 stops: ");
	        while (true) {
	            int number = Integer.valueOf(scanner.nextLine());
	            if (number == -1) {
	                break;
	            }
	            
	            distribution.addPointTotal(number);
	        }
	        
	        distribution.print();
	    }
	}