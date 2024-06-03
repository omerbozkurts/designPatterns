public class TelEvAletiAdapter implements ElektrikliEvAletleri{

    Telefon telefon;

    public TelEvAletiAdapter(Telefon telefon){
        this.telefon = telefon;
    }

    public int prizeTakCalistir(){
       return telefon.sarjEt();
    }


}
