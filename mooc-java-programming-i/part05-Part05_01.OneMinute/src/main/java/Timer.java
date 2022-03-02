/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhanu
 */
public class Timer {
    
    private ClockHand onehundredthsec;
    private ClockHand seconds;
    
    public Timer() {
        this.onehundredthsec = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public void advance() {
        this.onehundredthsec.advance();
        
        if (this.onehundredthsec.value() == 0) {
            this.seconds.advance();
        }
    }
    
    @Override
    public String toString() {
        return this.seconds + ":" + this.onehundredthsec;
    }
}