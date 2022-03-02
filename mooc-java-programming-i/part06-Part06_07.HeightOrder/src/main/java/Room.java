
import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        persons.add(person);
    }
    
    public boolean isEmpty() {
        return persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return persons;
    }
    
    public Person shortest() {
        // return a null reference if there's no one in the ride
        if (this.isEmpty()) {
            return null;
        }
        
        // create an object reference for the object to be returned
        // its first value is the first object on the list
        Person shortest = getPersons().get(0);
        
        // go through the list
        for (Person prs : getPersons()) {
            // compare each object on the list
            // to the shortest -- we compare heights
            // since we're searching for the shortest
            
            if (shortest.getHeight() > prs.getHeight()) {
                // if we find a shorter person in the comparison
                // we assign it as the value of the shortest
                shortest = prs;
            }
        }
        
        // finally, the object reference describing the
        // return object is returned
        return shortest;
    }
    
    public Person take() {
        if (this.isEmpty()) {
            return null;
        }
        
        Person shortest = this.shortest();
        persons.remove(shortest);
        return shortest;
    }
}