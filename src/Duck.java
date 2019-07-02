/**
 * @Author: EdenChanIy
 * @Date: 2019/7/2 11:08
 */
public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void swim(){
        //游泳方法
    }

    public abstract void display();
}
