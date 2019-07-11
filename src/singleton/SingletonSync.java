package singleton;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/11 12:38
 * 懒汉式，线程安全
 * 加锁会影响效率
 */
public class SingletonSync {
    private static SingletonSync uniqueInstance;

    private SingletonSync(){};

    public static synchronized SingletonSync getInstance(){
        if(uniqueInstance==null){
            uniqueInstance = new SingletonSync();
        }
        return uniqueInstance;
    }
}
