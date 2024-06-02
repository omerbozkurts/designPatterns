import java.util.NoSuchElementException;

public class IstanbulPizzaStore extends PizzaStore{

    @Override
    public IPizza createPizza(String type){
        System.out.println("istanbul pizza sunar:");
        if (type.equals("cheese")){
            return  new CheesePizza();
        }
        else if (type.equals("veggie")) {
            return new VeggiPizza();
        }
        else
            return null;
    }


}
