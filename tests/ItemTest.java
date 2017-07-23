import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import shop.Item;

/**
 * Created by user on 23/07/2017.
 */
public class ItemTest {

    private Item apple;

    @Before
    public void before() {
        apple = new Item("Apple", 0.50);
    }

    @Test
    public void testGetName() {
        String name = apple.getName();
        Assert.assertEquals("Apple", name);
    }

    @Test
    public void testGetPrice() {
        Double price = apple.getPrice();
        Assert.assertEquals(0.50, price, 0.001);
    }
}
