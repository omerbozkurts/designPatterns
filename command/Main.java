public class Main {
    public static void main(String[] args) {

        Lamba lamba = new Lamba();
        Kumanda kumanda = new Kumanda();
        kumanda.setCommand(new LambaAcCommand(lamba));
        kumanda.pressButton();

        kumanda.setCommand(new LambaKapatCommand(lamba));
        kumanda.pressButton();
    }
}