package shop;

import java.util.ArrayList;

/**
 * Created by user on 23/07/2017.
 */
public class Basket {
    private Customer customer;
    private ArrayList<Item> basket;

    public Basket() {
        this.basket = new ArrayList<>();
    }


    public int size() {
        return this.basket.size();
    }
}
