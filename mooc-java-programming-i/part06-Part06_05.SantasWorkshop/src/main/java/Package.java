
import java.util.ArrayList;

public class Package {
    
    private ArrayList<Gift> gifts;
    
    public Package() {
        this.gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }
    
    public int totalWeight() {
        int sumweight = 0;
        for (Gift gift : gifts) {
            sumweight += (gift.getWeight());
        }
        
        return sumweight;
    }
}