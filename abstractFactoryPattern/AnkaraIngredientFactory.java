public class AnkaraIngredientFactory implements PizzaIngredientFactory{

    public Dough createDough(){
        return new ThickCrustDough();
    }

    public Sauce createSauce(){
        return new MarinaraSauce();
    }


}
