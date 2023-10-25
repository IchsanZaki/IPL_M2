import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Product broccoli = new Vegetable();
        System.out.println("Vegetable Name: " + broccoli.getName());
        
        FoodProduct foodProduct = new Vegetable();
        System.out.println("Food Product Name: " + foodProduct.getName());
        System.out.println("Expired Date: " + foodProduct.getExpiredDate());
        
        Product smartphone = new Smartphone();
        System.out.println("Smartphone Name: " + smartphone.getName());
    }
}