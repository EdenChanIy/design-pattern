package factory;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/9 14:15
 */
public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String item){
        if(item.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if(item.equals("veggle")){
            return new NYStyleVegglePizza();
        }else if(item.equals("clam")){
            return new NYStyleClamPizza();
        }else if(item.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        }else return null;
    }
}
