
/**
 * Write a description of class Inventory here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Inventory
{
    List<Product> inventory;

    /**
     * Constructor for objects of class Inventory
     */
    public Inventory()
    { 
        inventory = new ArrayList<>();
    }

    public void addProduct(Product product){
        inventory.add(product);
    }

    public String getProduct(Product product){
        int x = inventory.indexOf(product);    
        return inventory.get(x).getClass().getSimpleName();
    }

    public int getTotalQuantity(){
        int sum = 0;
        for(Product product : inventory)
            sum += product.getQuantity();
        return sum;
    }

    public String getTotalValue(){
        String s = "$";
        double sum = 0.0;
        for(Product product : inventory)
            sum += product.getPrice() * product.getQuantity();
        return s+sum;
    }

    public String createAudit()
    { 
        String s = "Product:| ID  |  Quantity   Value\n";
        for(Product product : inventory){
            String p = getProduct(product);
            String i = product.getId();
            int q = product.getQuantity();
            double pr = product.getPrice();
            String out = String.format("%7s:|%5s|    %3d      $%.2f%n", p, i, q, pr);
            s += out;
        }
        s += "Total items: " + getTotalQuantity() + " Total value: " + getTotalValue();

        return s;   
    }
}
