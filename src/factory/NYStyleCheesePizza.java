package factory;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/9 15:53
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(){
        name = "NY Style Sauce and Cheese Pizza";
//        dough = "Thin Crust Dough";
//        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }

    public void prepare(){

    }
}
