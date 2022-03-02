
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        // return a null reference if there's no one on the ride
        if (getElements().isEmpty()) {
            return null;
        }
        
        String longest = getElements().get(0);
        
        for (String element : getElements()) {
            if (longest.length() < element.length()) {
                longest = element;
            }
        }
        
        return longest;
    }
}
