public class AnkaraPizzaStore extends PizzaStore{

    @Override
    public IPizza createPizza(String type){
        System.out.println("ankara pizza sunar:");
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
