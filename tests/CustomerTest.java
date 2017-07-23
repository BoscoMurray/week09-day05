import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import shop.Customer;

/**
 * Created by user on 23/07/2017.
 */
public class CustomerTest {

    private Customer jimmy;

    @Before
    public void before() {
        jimmy = new Customer("Jimmy");
    }

    @Test
    public void testGetName() {
        String name = jimmy.getName();
        Assert.assertEquals("Jimmy", name);
    }

    @Test
    public void testLoyaltyFalse() {
        Boolean loyalty = jimmy.getLoyalty();
        Assert.assertEquals(false, loyalty);
    }

    @Test
    public void testLoyaltyTrue() {
        jimmy.setLoyaltyTrue();
        Boolean loyalty = jimmy.getLoyalty();
        Assert.assertEquals(true, loyalty);
    }
}
