public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;

    abstract void prepare();

    void bake(){
        System.out.println("Baking " + this.name);
    }

    void cut(){
        System.out.println("Cut " + this.name);
    }

    void box(){
        System.out.println("Box " + this.name);
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public String toString() {
        return "Pizza: " + name + ", Dough: " + dough + ", Sauce: " + sauce;
    }

}
