package factory;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/9 15:56
 */
public class PuzzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza =nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+ pizza.getName() + "\n");
    }
}
