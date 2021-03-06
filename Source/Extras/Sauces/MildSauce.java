package Extras.Sauces;
import Rolls.*;
import Extras.*;

public class MildSauce extends Extras {
    final Double price = 0.25;
    
    /* Decorating */
    public MildSauce(Roll _roll) {
        this.roll = _roll;
    }

    public String getDescription() {
        return this.roll.getDescription() + " + MildSauce";
    }

    public Double getPrice() {
        return this.roll.getPrice() + price; 
    }
}