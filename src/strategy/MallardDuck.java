package strategy;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/2 11:45
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack(); //当performQuack()被调用的时候，呱呱叫被真正委托给Quack对象
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("我是一只绿头鸭");
    }
}
