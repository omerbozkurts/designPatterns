import java.util.ArrayList;
import java.util.Objects;


public class Director extends Employee{
    ArrayList <Employee> subEmployee= new ArrayList<Employee>();

    public Director(String name){
        super(name);
    }

    public void addSubEmployee(Employee e){
        subEmployee.add(e);
        e.setDirector(this);
    }

}
