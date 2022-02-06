
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int num : array) {
            int starno = 0;
            while (starno < num) {
                System.out.print("*");
                ++starno;
            }
            System.out.println();
        }
    }
}
