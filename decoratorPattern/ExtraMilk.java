public class ExtraMilk extends CoffeeDecorater{

    public ExtraMilk (Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription() + " Extra Milk";
    }

    @Override
    public double getCoast(){
        return decoratedCoffee.getCoast() + 2.5;
    }


}
