package strategy;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/2 11:19
 * 针对呱呱叫叫声的实现类
 */
public class Quack implements QuackBehavior{
    public void quack(){
        //此处实现呱呱叫行为
        System.out.println("呱呱呱");
    }
}
