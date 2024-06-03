public class LambaAcCommand implements  Command{

    Lamba lamba;

    public LambaAcCommand(Lamba lamba){
        this.lamba = lamba;
    }

    public void execute(){
        lamba.on();
    }

}
