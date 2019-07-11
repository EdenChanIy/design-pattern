package singleton;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/11 12:42
 * 饿汉式
 */
public class SingletonHungry {
    private static SingletonHungry uniqueInstance = new SingletonHungry();

    private SingletonHungry(){};
    public SingletonHungry getInstance(){
        return uniqueInstance;
    }
}
