public class PaymentCard {
    private double balance;
    
    public PaymentCard(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public void eatAffordably() {
        if (balance >= 2.60) {
            balance -= 2.60;
        }
    }
    
    public void eatHeartily() {
        if (balance >= 4.60) {
            balance -= 4.60;
        }
    }
    
    public void addMoney(double deposit) {
        if (deposit > 0) {
            if (balance+deposit < 150) {
                balance += deposit;
            } else {
            balance = 150;
            }
        }
    }
    
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
}