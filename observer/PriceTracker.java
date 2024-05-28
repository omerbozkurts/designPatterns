import java.awt.color.ProfileDataException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class PriceTracker implements ICimriCom {

    private List<IObserver> observers;
    private Product product;
    private double price;

    public PriceTracker(Product product){
        this.observers = new ArrayList<>();
        this.product = product;

    }

    public void registerObserver(IObserver observer, Product product){
        observers.add(observer);
       this.product = product;
    }

    public void removeObserver(IObserver observer){
        try{
            observers.remove(observer);
        }
        catch (NoSuchElementException e) {
            System.out.println(e);
            }

    }

    public void notifyAllObservers(){
        for (IObserver observer: observers)
                observer.update(this.product, this.price);
    }


    public void setPrice(double price){
        this.product.setPrice(price);
        notifyAllObservers();
    }

}
