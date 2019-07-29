package strategy;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/2 11:08
 * 定义抽象类作为超类型类，子类继承后改写方法
 */
public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void swim(){
        //游泳方法
    }

    public abstract void display(); //抽象方法保证子类必须重写
}
