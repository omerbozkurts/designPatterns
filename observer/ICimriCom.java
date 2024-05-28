public interface ICimriCom {
    void registerObserver(IObserver observer, Product product);
    void removeObserver(IObserver observer);
    void notifyAllObservers();
}
