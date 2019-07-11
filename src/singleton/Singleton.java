package singleton;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/11 11:47
 * 经典的单例模式实现
 * 懒汉式，线程不安全
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(uniqueInstance==null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
