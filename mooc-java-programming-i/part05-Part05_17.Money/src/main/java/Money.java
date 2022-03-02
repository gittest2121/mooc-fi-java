
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        int neweuros = this.euros() + addition.euros();
        int newcents = this.cents() + addition.cents();
        Money newMoney = new Money(neweuros, newcents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        double thisTotal = this.euros + this.cents / 100.0;
        double compareTotal = compared.euros() + compared.cents() / 100.0;
        
        return thisTotal < compareTotal;
    }
    
    public Money minus(Money decreaser) {
            int neweuros = this.euros() - decreaser.euros();
            int newcents = this.cents() - decreaser.cents();
            
            if (newcents < 0) {
                newcents += 100;
                --neweuros;
            }
            
            // if the value becomes negative, return zero
            if (neweuros < 0) {
                return new Money(0, 0);
            }
            
            return new Money(neweuros, newcents);
    }

    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
