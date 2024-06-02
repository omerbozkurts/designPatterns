public class MilkDecorator extends  CoffeeDecorater{

    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription() + "Milk";
    }

    public double getCoast(){
        return decoratedCoffee.getCoast() + 1.5;
    }

}
