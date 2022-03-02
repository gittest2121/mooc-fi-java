public class Statistics {
    private int count;
    private int sum = 0;
    
    public Statistics() {
        int numberCount = 0;
        this.count = numberCount;
    }
    
    public void addNumber(int number) {
        ++count;
        sum += number;
    }
    
    public int getCount() {
        return count;
    }
    
    public int sum() {
        return sum;
    }
    
    public double average() {
        if (count == 0) {
            return 0;
        } else {
        return ((double) sum)/count;
        }
    }
}