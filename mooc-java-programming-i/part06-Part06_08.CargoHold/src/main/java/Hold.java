
import java.util.ArrayList;

public class Hold {
    private int maxweight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxweight) {
        this.maxweight = maxweight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + this.totalWeight() <= this.maxweight) {
            this.suitcases.add(suitcase);
        }
    }
    
    public int totalWeight() {
        int totalweight = 0;
        for (Suitcase suitcase : this.suitcases) {
            totalweight += suitcase.totalWeight();
        }
        
        return totalweight;
    }
    
    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }
            
    @Override
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}