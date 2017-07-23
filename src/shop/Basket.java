package shop;

import java.util.HashMap;

/**
 * Created by user on 23/07/2017.
 */
public class Basket {
    private Customer customer;
    private HashMap<Item, Integer> basket;

    public Basket() {
        this.basket = new HashMap<>();
    }


    public int size() {
        return this.basket.size();
    }

    public void add(Item apple) {

    }
}
