
/**
 * Created by leon on 1/10/18.
 */
public abstract class Product {
    private double price;
    private String id;
    private int quantity;

    public Product(double price, String id, int quantity){
        this.price = price;
        this.id = id;
        this.quantity = quantity;
    }

    public  void setPrice(double num){
        price = num;
    }

    public double getPrice(){
        return price;
    }

    public  void setId(String code){
        id = code;
    }

    public String getId(){
        return id;
    }

    public  void setQuantity(int num){
        quantity = num;
    }

    public int getQuantity(){
        return quantity;
    }

    
}
