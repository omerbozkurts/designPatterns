public class LambaKapatCommand implements Command{

    Lamba lamba;

    public LambaKapatCommand(Lamba lamba){
        this.lamba = lamba;
    }

    public void execute(){
        lamba.off();
    }

}
