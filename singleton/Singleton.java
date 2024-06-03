public class Singleton {

    private static Singleton instance;

    private String text;

    private Singleton(){
        text = "hello world";
    }

    public static Singleton getInstance(){
        if (instance == null)
                instance = new Singleton();
        return instance;
    }

    public String getText(){
        return this.text;
    }

}
