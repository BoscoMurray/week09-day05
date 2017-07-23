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
    private Item orange;
    private Customer jimmy;
    private Basket basket;

    @Before
    public void before() {
        apple = new Item("Apple", 0.50);
        banana = new Item("Banana", 0.40);
        orange = new Item("Orange", 0.55);
        jimmy = new Customer("Jimmy");
        basket = new Basket();
    }

    @Test
    public void testEmptyBasket() {
        int size = basket.size();
        Assert.assertEquals(0, size);
    }
}
