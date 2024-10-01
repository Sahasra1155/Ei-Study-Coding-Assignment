package observer_design_pattern;

public interface Subject {
    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers();
}
