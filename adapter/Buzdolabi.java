public class Buzdolabi implements ElektrikliEvAletleri{

    private int volt;

    public Buzdolabi(){
        this.volt = 220;
    }

    public int prizeTakCalistir(){
        System.out.println("buzdolabi calistirildi");
        return this.volt;
    }

}
