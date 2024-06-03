public class SekilCizici {

    private Kare kare;
    private Daire daire;
    private Ucgen ucgen;

    public SekilCizici(){
        kare = new Kare();
        daire = new Daire();
        ucgen = new Ucgen();
    }

    public void kareCiz(){
        kare.sekilCiz();
    }

    public void daireCiz(){
        daire.sekilCiz();
    }

    public void ucgenCiz(){
        ucgen.sekilCiz();
    }

}
