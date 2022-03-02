
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println("Smallest: " + MainProgram.smallest(array));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
        
        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
        
        int[] nums = {3, 2, 5, 4, 8};
        System.out.println(Arrays.toString(nums));
        
        MainProgram.swap(nums, 1, 0);
        System.out.println(Arrays.toString(nums));
        
        MainProgram.swap(nums, 0, 3);
        System.out.println(Arrays.toString(nums));
        
        System.out.println();
        
        int[] numberArray = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numberArray);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number : array) {
           if (smallest > number) {
               smallest = number;
           }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int smallestIndex = 0;
        for (int i = 0; i < array.length; ++i) {
            if (smallest > array[i]) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        
        return smallestIndex;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int smallestIndex = startIndex;
        for (int i = smallestIndex; i < table.length; ++i) {
            if (smallest > table[i]) {
                smallest = table[i];
                smallestIndex = i;
            }
        }
        
        return smallestIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        if (index1 >= 0 && index2 >= 0) {
            if (index1 < array.length && index2 < array.length) {
                int temp = array[index2];
                array[index2] = array[index1];
                array[index1] = temp;        
            }
        }
    }
    
    // Selection Sort -- Sorting Algorithm
    public static void sort(int[] array) {
        int sortindex = 0;
        while (sortindex < array.length) {
            System.out.println(Arrays.toString(array));
            int smallestindex = MainProgram.indexOfSmallestFrom(array, sortindex);
            MainProgram.swap(array, sortindex, smallestindex);
            
            ++sortindex;
        }
    }
}
