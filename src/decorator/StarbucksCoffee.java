package decorator;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/5 10:18
 */
public class StarbucksCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        Beverage beverage1 = new Espresso();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription()+" $"+beverage1.cost());

        Beverage beverage2 = new Espresso();
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription()+" $"+beverage2.cost()); //涉及到double运算的精度问题
    }
}
