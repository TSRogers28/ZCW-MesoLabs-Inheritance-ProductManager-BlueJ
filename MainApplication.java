
/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {

    public MainApplication(){


    }
    public static void main(String[] args){
        Manager manager = new Manager();
        Product apples = new Apple(.50, "iasw5", 45);
        Product bananas = new Banana(.25, "ibsw5", 85);
        Product pears = new Pear(.80, "iosw5", 30);
        manager.addProduct(apples);
        manager.addProduct(bananas);
        manager.addProduct(pears);

        System.out.println(manager.getProduct(apples));
        System.out.println(manager.getTotalValue());
        System.out.println(manager.getTotalQuantity());
        System.out.println(manager.createAudit());

    }    

    
    
}

