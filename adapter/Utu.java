public class Utu implements ElektrikliEvAletleri{

    private int volt;

    public Utu(){
        this.volt = 220;
    }

    public int prizeTakCalistir(){
        System.out.println("utu calisti");
        return this.volt;
    }

}
