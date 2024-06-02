public class AnkaraPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new AnkaraIngredientFactory();
        if ( type.equals("cheese")){
            pizza =  new CheesePizza(pizzaIngredientFactory);
            pizza.setName("Angara usulu peynirli pizza gardassss");
        }
        return pizza;
    }
}
