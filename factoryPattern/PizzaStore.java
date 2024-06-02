

public abstract class PizzaStore {

    protected abstract  IPizza createPizza(String type);

    public IPizza OrderPizza(String type){

        IPizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
