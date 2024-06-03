public class Priz {

    public void elektrikVer(ElektrikliEvAletleri elektrikliEvAletleri){
        int volt = elektrikliEvAletleri.prizeTakCalistir();
        System.out.println("Prizden " + volt + " volt aliniyor");
    }

}
