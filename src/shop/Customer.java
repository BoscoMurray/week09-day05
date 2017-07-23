package shop;

import java.util.function.BooleanSupplier;

/**
 * Created by user on 23/07/2017.
 */
public class Customer {
    private String name;
    private Boolean loyalty;
    
    public Customer(String name) {
        this.name = name;
        this.loyalty = false;
    }

    public String getName() {
        return name;
    }

    public Boolean getLoyalty() {
        return loyalty;
    }

    public void setLoyaltyTrue() {
        this.loyalty = true;
    }
}
