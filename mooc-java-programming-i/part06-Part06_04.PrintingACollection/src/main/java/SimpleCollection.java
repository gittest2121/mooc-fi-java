
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
    
    @Override
    public String toString() {
        String text = "The collection " + this.name + " ";
        
        if (getElements().isEmpty()) {
            return text + "is empty.";
        }
        
        String elementlist = ""; 
        for (String element : elements) {
            elementlist += ("\n" + element);
        }
        
        if (getElements().size() == 1) {
            return text + "has " + getElements().size() + " element:" + elementlist;
        }
        
        return text + "has " + getElements().size() + " elements:" + elementlist;
    }
}
