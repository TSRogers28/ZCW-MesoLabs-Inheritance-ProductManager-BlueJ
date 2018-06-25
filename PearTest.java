
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PearTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PearTest
{
    Product pears;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        pears = new Pear(.75, "492a", 10);
    }

    @Test
    public void testPrice(){
        double expected = .75;
        double actual = pears.getPrice();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testSetPrice(){
        pears.setPrice(.85);
        double expected = .85;
        double actual = pears.getPrice();
        assertEquals(expected, actual, 0);;
    }

    @Test
    public void testId(){

        String expected = "492a";
        String actual = pears.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetId(){
        pears.setId("2817A");
        String expected = "2817A";
        String actual = pears.getId();
        assertEquals(expected, actual);;
    }

    @Test
    public void testQuantity(){

        int expected = 10;
        int actual = pears.getQuantity();
        assertEquals(expected, actual);;
    }

    @Test
    public void testSetQuantity(){
        pears.setQuantity(50);
        int expected = 50;
        int actual = pears.getQuantity();
        assertEquals(expected, actual);;
    }
}
