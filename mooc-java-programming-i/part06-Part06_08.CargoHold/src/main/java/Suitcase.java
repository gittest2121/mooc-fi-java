
import java.util.ArrayList;

public class Suitcase {
    private int maxweight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxweight) {
        this.maxweight = maxweight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maxweight) {
            this.items.add(item);
        }
    }
    
    public int totalWeight() {
        int totalweight = 0;
        for (Item item : this.items) {
            totalweight += item.getWeight();
        }
        
        return totalweight;
    }
    
    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item.toString());
        }
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        for (Item item : this.items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
    
    @Override
    public String toString() {
        String itemors;
        if (this.items.isEmpty()) {
            itemors = "no items";
        } else if (this.items.size() == 1) {
            itemors = this.items.size() + " item";
        } else {
            itemors = this.items.size() + " items";
        }
        return itemors + " (" + this.totalWeight() + " kg)";
    }
    
}