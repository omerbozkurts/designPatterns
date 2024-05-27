public class Main {
    public static void main( String args[]){
        Employee ali = new Employee("ali");
        Employee veli = new Employee("veli");
        Director metin = new Director("metin");
        metin.addSubEmployee(ali);
        metin.addSubEmployee(veli);

        for(Employee e: metin.subEmployee){
            System.out.println(e.getName());
        }
    }
}
