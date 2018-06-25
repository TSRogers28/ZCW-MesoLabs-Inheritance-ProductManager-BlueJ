
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class InventoryTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class InventoryTest
{
    /**
     * Default constructor for test class InventoryTest
     */
    Product pears;
    Inventory inventory;
    Product apples;
    Product bananas;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {   pears = new Pear(.75, "492a", 10);
        inventory = new Inventory();
        apples = new Apple(.50, "iasw5", 45);
        bananas = new Banana(.25, "ibsw5", 85);
    }

    @Test
    public void testGetProduct(){
        inventory.addProduct(pears);

        String actual = inventory.getProduct(pears);
        String expected = "Pear";

        assertEquals(actual,expected);
    }

    @Test
    public void testGetTotalQuantity(){
        inventory.addProduct(pears);
        inventory.addProduct(apples);
        inventory.addProduct(bananas);

        int actual = inventory.getTotalQuantity();
        int expected = 140;

        assertEquals(actual,expected);
    }

    @Test
    public void testGetTotalValue(){
        inventory.addProduct(pears);
        inventory.addProduct(apples);
        inventory.addProduct(bananas);

        String actual = inventory.getTotalValue();
        String expected = "$51.25";

        assertEquals(actual,expected);
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
