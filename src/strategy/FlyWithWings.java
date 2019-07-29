package strategy;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/2 15:31
 * 针对使用翅膀飞的行为的实现类
 */
public class FlyWithWings implements FlyBehavior {
    public void fly(){
        System.out.println("我在飞");
    }
}
