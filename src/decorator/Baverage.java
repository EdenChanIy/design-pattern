package decorator;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/4 20:19
 */
public abstract class Baverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double coust();
}
