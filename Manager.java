
/**
 * Write a description of class Manager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class Manager
{
    // instance variables - replace the example below with your own

    Inventory list;

    /**
     * Constructor for objects of class Manager
     */
    public Manager()
    {
        list = new Inventory();
    }

    public void addProduct(Product product){
        list.addProduct(product);
    }

    public String getProduct(Product product){
        return list.getProduct(product);
    }

    public String getTotalValue(){
        return list.getTotalValue();
    }

    public int getTotalQuantity(){
        return list.getTotalQuantity();
    }

    public String createAudit(){
        return list.createAudit();
    }

}
