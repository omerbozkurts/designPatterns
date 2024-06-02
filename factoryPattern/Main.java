public class Main {
    public static void main(String[] args) {
        PizzaStore ankaraPizzaStore = new AnkaraPizzaStore();
        PizzaStore istanbulPizzaStore = new IstanbulPizzaStore();

        IPizza pizza = ankaraPizzaStore.OrderPizza("cheese");

        System.out.println("\n");

        pizza = istanbulPizzaStore.OrderPizza("cheese");

        System.out.println("\n");

        pizza = ankaraPizzaStore.OrderPizza("veggie");
    }
}