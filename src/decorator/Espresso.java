package decorator;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/5 9:56
 */
public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }

    public double cost(){
        return 1.99;
    }
}
