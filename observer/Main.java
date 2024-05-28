public class Main {
    public static void main( String [] args){
      Product samsung = new Product("s23",25000);

      User ali = new User("ali yilmaz");
      User ahmet = new User("ahmet durmaz");

      PriceTracker samsungTracke = new PriceTracker(samsung);
      samsungTracke.registerObserver(ali,samsung);
      samsungTracke.setPrice(25500);

      samsungTracke.registerObserver(ahmet,samsung);
      samsungTracke.setPrice(23000);
      

    }
}
