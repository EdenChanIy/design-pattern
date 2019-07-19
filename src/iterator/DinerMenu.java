package iterator;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/19 15:50
 */
public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "description about VBLT", true, 2.99);
        addItem("BLT", "description about BLT", false, 2.99);
        addItem("Soup", "description about Soup", false, 3.29);
        addItem("Hotdog", "description about Hotdog", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItems>=MAX_ITEMS){
            System.err.println("Sorry, menu is full!");
        } else {
            menuItems[numberOfItems++] = menuItem;
        }
    }
}
