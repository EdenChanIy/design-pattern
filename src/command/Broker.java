package command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/14 20:44
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
