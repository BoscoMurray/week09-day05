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
        for(Map.Entry<Item, Integer> entry : this.basket.entrySet()) {
            count += entry.getValue();
        }
        return count;
    }

    public void add(Item item) {
        Integer count = basket.get(item);
        this.basket.put(item, (count==null) ? 1 : count+1);
    }

    public void addCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void empty() {
        this.basket.clear();
    }

    public void remove(Item item) {
        for(Map.Entry<Item, Integer> entry : this.basket.entrySet()) {
            Integer count = entry.getValue();
            if (item == entry.getKey()) {
                this.basket.put(item, count -1);
            }
        }
    }

    public Double getValue() {
        Double value = 0.0;
        for(Map.Entry<Item, Integer> entry : this.basket.entrySet()) {
            Double entryValue = this.getEntryValue(entry.getKey(), entry.getValue());
//            Double entryValue = entry.getKey().getPrice() * entry.getValue();
            value += entryValue;
        }
        return value;
    }

    private Double getEntryValue(Item item, Integer quantity) {
        if (quantity == 0) { return 0.0; }

        Double total;
        if (quantity % 2 == 0) {
            total = item.getPrice() * quantity / 2;
        } else {
            total = item.getPrice() * (quantity-1) / 2;
            total += item.getPrice();
        }
        return total;
    }

}
