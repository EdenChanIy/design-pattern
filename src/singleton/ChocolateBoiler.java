package singleton;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/11 12:01
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler chocolateBoiler;



    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoiler getInstance(){
        if(chocolateBoiler==null){
            chocolateBoiler = new ChocolateBoiler();
        }
        return chocolateBoiler;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if(!isEmpty()&&isBoiled()){
            empty = true;
        }
    }

    public void boil(){
        if(!isEmpty()&&!isBoiled()){
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}
