import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import shop.Basket;
import shop.Customer;
import shop.Item;

/**
 * Created by user on 23/07/2017.
 */
public class BasketTest {
    private Item apple;
    private Item banana;
    private Item whiskey;
    private Customer jimmy;
    private Basket basket;

    @Before
    public void before() {
        apple = new Item("Apple", 0.50);
        banana = new Item("Banana", 0.40);
        whiskey = new Item("Whiskey", 20.55);
        jimmy = new Customer("Jimmy");
        basket = new Basket();
    }

    @Test
    public void testForEmptyBasket() {
        int size = basket.size();
        Assert.assertEquals(0, size);
    }

    @Test
    public void testAddItem() {
        basket.add(apple);
        basket.add(apple);
        basket.add(banana);
        int size = basket.size();
        Assert.assertEquals(3, size);
    }

    @Test
    public void testAddCustomer() {
        basket.addCustomer(jimmy);
        Customer customer = basket.getCustomer();
        Assert.assertEquals(jimmy, customer);
    }

    @Test
    public void testEmptyingOfBasket() {
        basket.add(apple);
        basket.empty();
        int size = basket.size();
        Assert.assertEquals(0, size);
    }

    @Test
    public void testRemoveItem() {
        basket.add(apple);
        basket.add(apple);
        basket.add(banana);
        basket.remove(apple);
        int size = basket.size();
        Assert.assertEquals(2, size);
    }

    @Test
    public void testGetValue() {
        basket.add(apple);
        basket.add(apple);
        basket.add(banana);
        Double value = basket.getValue();
        Assert.assertEquals(0.90, value, 0.001);
    }

    @Test
    public void testDiscountOver20() {
        basket.add(whiskey);
        Double value = basket.getValue();
        Assert.assertEquals(18.50, value, 0.001);
    }

    @Test
    public void testDiscountWithLoyalty() {
        basket.add(apple);
        basket.add(whiskey);
        jimmy.setLoyaltyTrue();
        basket.addCustomer(jimmy);
        Double value = basket.getValue();
        Assert.assertEquals(18.57, value, 0.001);
    }
}
