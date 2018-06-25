
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AppleTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AppleTest
{
    Product apples;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        apples = new Apple(.75, "492a", 10);
    }

    @Test
    public void testPrice(){
        double expected = .75;
        double actual = apples.getPrice();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testSetPrice(){
        apples.setPrice(.85);
        double expected = .85;
        double actual = apples.getPrice();
        assertEquals(expected, actual, 0);;
    }

    @Test
    public void testId(){

        String expected = "492a";
        String actual = apples.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetId(){
        apples.setId("2817A");
        String expected = "2817A";
        String actual = apples.getId();
        assertEquals(expected, actual);;
    }

    @Test
    public void testQuantity(){

        int expected = 10;
        int actual = apples.getQuantity();
        assertEquals(expected, actual);;
    }

    @Test
    public void testSetQuantity(){
        apples.setQuantity(50);
        int expected = 50;
        int actual = apples.getQuantity();
        assertEquals(expected, actual);;
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
