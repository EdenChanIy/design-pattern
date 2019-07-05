package decorator;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/5 10:04
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "House Blend Coffee";
    }

    public double cost(){
        return .89;
    }
}
