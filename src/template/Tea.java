package template;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/18 15:10
 */
public class Tea {
    void prepareRecipe(){
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void boilWater(){
        System.out.println("Boiling water");
    }

    public void steepTeaBag(){
        System.out.println("Steeping the tea");
    }

    public void addLemon(){
        System.out.println("Adding Lemon");
    }

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }
}
