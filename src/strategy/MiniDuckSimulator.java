package strategy;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/2 15:34
 * 测试类
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowerd());
        model.performFly();
    }
}
