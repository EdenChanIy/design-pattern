package command;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/14 20:44
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
