public class Main {
    public static void main(String[] args) {
       Priz priz = new Priz();
       Buzdolabi buzdolabi = new Buzdolabi();
       Utu utu = new Utu();

       priz.elektrikVer(buzdolabi);

       priz.elektrikVer(utu);

       Samsung samsung = new Samsung();

       TelEvAletiAdapter adapter = new TelEvAletiAdapter(samsung);

       priz.elektrikVer(adapter);

    }
}