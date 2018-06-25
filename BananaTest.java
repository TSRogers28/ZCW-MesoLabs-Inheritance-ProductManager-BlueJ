
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BananaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BananaTest
{
    Product bananas;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        bananas = new Banana(.75, "492a", 10);
    }

    @Test
    public void testPrice(){
        double expected = .75;
        double actual = bananas.getPrice();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testSetPrice(){
        bananas.setPrice(.85);
        double expected = .85;
        double actual = bananas.getPrice();
        assertEquals(expected, actual, 0);;
    }

    @Test
    public void testId(){

        String expected = "492a";
        String actual = bananas.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetId(){
        bananas.setId("2817A");
        String expected = "2817A";
        String actual = bananas.getId();
        assertEquals(expected, actual);;
    }

    @Test
    public void testQuantity(){

        int expected = 10;
        int actual = bananas.getQuantity();
        assertEquals(expected, actual);;
    }

    @Test
    public void testSetQuantity(){
        bananas.setQuantity(50);
        int expected = 50;
        int actual = bananas.getQuantity();
        assertEquals(expected, actual);;
    }
}
