
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money a = new Money(10,0);
        Money b = new Money(5,0);

        Money c = a.plus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

        a = a.plus(c);          // NB: a new Money object is created, and is placed "at the end of the strand connected to a"
        //  the old 10 euros at the end of the strand disappears and the Java garbage collector takes care of it

        System.out.println(a);  // 25.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e
        
        Money ab = new Money(10, 0);
        Money bc = new Money(3, 0);
        Money cd = new Money(5, 0);

        System.out.println(ab.lessThan(bc));  // false
        System.out.println(bc.lessThan(cd));  // true
        
        Money a1 = new Money(10, 0);
        Money b1 = new Money(3, 50);

        Money c1 = a1.minus(b1);

        System.out.println(a1);  // 10.00e
        System.out.println(b1);  // 3.50e
        System.out.println(c1);  // 6.50e

        c1 = c1.minus(a1);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
        //  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it


        System.out.println(a1);  // 10.00e
        System.out.println(b1);  // 3.50e
        System.out.println(c1);  // 0.00e
    }
}
