public class IstanbulIngredientFactory implements PizzaIngredientFactory{

    public Dough createDough(){
        return new ThinCrustDough();
    }

    public Sauce createSauce(){
        return new PlumTomatoSauce();
    }

}
