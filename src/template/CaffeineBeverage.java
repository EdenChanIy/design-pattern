package template;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/18 15:14
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }

    //钩子
    boolean customerWantsCondiments(){
        return true;
    }
}
