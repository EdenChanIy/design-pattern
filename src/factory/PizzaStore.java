package factory;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/5 15:39
 */
public abstract class PizzaStore {
    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory factory){
        this.simplePizzaFactory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
