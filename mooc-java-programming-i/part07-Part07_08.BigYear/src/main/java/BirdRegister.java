
import java.util.ArrayList;

public class BirdRegister {
    private ArrayList<Bird> register;

    public BirdRegister() {
        this.register = new ArrayList<>();
    }
    
    public void add(String name, String latinName) {
        this.register.add(new Bird(name, latinName));
    }
    
    public void observe(Bird birdName) {
        birdName.observe();
    }
    
    public void print() {
        for (Bird bird : register) {
            System.out.println(bird);
        }
    }
    
    public Bird search(String birdName) {
        for (Bird bird : this.register) {
            if (bird.getName().equals(birdName)) {
                return bird;
            }
        }
        
        return null;
    }
}