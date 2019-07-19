package iterator;

import java.util.ArrayList;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/19 15:46
 */
public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList();

        addItem("Pancake A", "a Pancake with A", true, 2.99);
        addItem("Pancake B", "a Pancake with B", false, 2.99);
        addItem("Pancake C", "a Pancake with C", true, 3.49);
        addItem("Pancake D", "a Pancake with D", true, 3.59);
    }

    public void addItem(String name, String decription, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, decription, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems(){
        return menuItems;
    }
}
