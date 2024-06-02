public class Main {
    public static void main(String[] args) {
        RegularCoffe rCoffee = new RegularCoffe();
        System.out.println(rCoffee.getCoast());
        System.out.println(rCoffee.getDescription());

        SugarDecorator sDecorator = new SugarDecorator(rCoffee);
        System.out.println(sDecorator.getDescription());
        System.out.println(sDecorator.getCoast());


        ExtraMilk extraMilk = new ExtraMilk(rCoffee);
        System.out.println(extraMilk.getDescription());
        System.out.println(extraMilk.getCoast());

    }
}