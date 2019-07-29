package strategy;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/2 15:31
 * 针对不会飞行为的实现类
 */
public class FlyNoWay implements FlyBehavior {
    public void fly(){
        System.out.println("我不能飞");
    }
}
