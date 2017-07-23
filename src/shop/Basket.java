package shop;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 23/07/2017.
 */
public class Basket {
    private Customer customer;
    private HashMap<Item, Integer> basket;

    public Basket() {
        this.basket = new HashMap<>();
    }


    public Integer size() {
        if (this.basket.size() == 0) {
            return 0;
        }

        Integer count = 0;
        for(Map.Entry<Item, Integer> entry : basket.entrySet()) {
            count += entry.getValue();
        }
        return count;
    }

    public void add(Item item) {
        Integer count = basket.get(item);
        basket.put(item, (count==null) ? 1 : count+1);
    }

    public void addCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
