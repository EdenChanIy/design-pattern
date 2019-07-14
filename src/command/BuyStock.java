package command;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/14 20:43
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
