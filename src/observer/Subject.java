package observer;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/3 15:15
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
