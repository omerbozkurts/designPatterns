public abstract class CoffeeDecorater implements Coffee {

    protected Coffee decoratedCoffee;

    public CoffeeDecorater (Coffee decoratedCoffee){
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getCoast(){
        return decoratedCoffee.getCoast();
    }

}
