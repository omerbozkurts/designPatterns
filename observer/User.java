public class User implements IObserver{

    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void update(Product product, double price){
        System.out.println("hey " + this.getName() + "! The price of " + product.getName() + " has changed to " + product.getPrice());
    }


}
