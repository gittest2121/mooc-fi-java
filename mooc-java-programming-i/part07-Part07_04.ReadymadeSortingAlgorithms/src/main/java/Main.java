
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        Main.sort(array);
        System.out.println(Arrays.toString(array));
        
        String[] animals = {"Cat", "Dog", "Parrot", "Sparrow", "Monkey", "Crow", "Lion"};
        Main.sort(animals); // sorts alphabetically - dictionary order
        System.out.println(Arrays.toString(animals));
        
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(7);
        integers.add(-5);
        integers.add(0);
        integers.add(7750);
        Main.sortIntegers(integers);
        System.out.println(integers);
        
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Ready");
        strings.add("Right");
        strings.add("Roast");
        strings.add("Real");
        strings.add("Read");
        strings.add("Really");
        Main.sortStrings(strings); // dictionary order
        System.out.println(strings);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
