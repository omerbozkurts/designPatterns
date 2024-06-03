public class Samsung implements Telefon{

    private int calismaVoltaji;

    public Samsung(){
        this.calismaVoltaji = 5;
    }

    public int sarjEt(){
        System.out.println("samsung sarj ediliyor");
        return  calismaVoltaji;
    }

}
