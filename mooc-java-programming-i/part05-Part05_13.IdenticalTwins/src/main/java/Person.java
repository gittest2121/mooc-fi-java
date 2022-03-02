
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    @Override
    public boolean equals(Object compared) {
        // check references
        if (this == compared) {
            return true;
        }
        
        // check Object types
        if (!(compared instanceof Person)) {
            return false;
        }
        
        // cast object to object Person
        Person comparedPerson = (Person) compared;
        
        // check instance variables
        if (this.name.equals(comparedPerson.name) &&
                this.weight == comparedPerson.weight &&
                this.height == comparedPerson.height &&
                this.birthday.equals(comparedPerson.birthday)) {
            return true;
        }
        
        // else
        return false;
    }
}
