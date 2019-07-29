package strategy;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/2 15:58
 * 针对助飞器飞行的实现类
 */
public class FlyRocketPowerd implements FlyBehavior {
    public void fly(){
        System.out.println("我在用助飞器飞");
    }
}
