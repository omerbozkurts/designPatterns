public class SugarDecorator extends CoffeeDecorater{

    public SugarDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription() + "Sugar";
    }

    public double getCoast(){
        return decoratedCoffee.getCoast() + 1.0;
    }

}
