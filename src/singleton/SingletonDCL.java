package singleton;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/11 13:15
 * 双重检查加锁
 * 只有第一次的时候会同步
 * Java1.5以上适用
 */
public class SingletonDCL {
    private volatile static SingletonDCL uniqueInstance;

    private SingletonDCL(){};

    public static SingletonDCL getInstance(){
        if(uniqueInstance==null){
            synchronized (SingletonDCL.class){
                if(uniqueInstance==null){
                    uniqueInstance = new SingletonDCL();
                }
            }
        }
        return uniqueInstance;
    }
}
