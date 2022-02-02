
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; ++i) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; ++i) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = size; i >= 0; --i) {
            printStars(size-i);
            printSpaces(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
