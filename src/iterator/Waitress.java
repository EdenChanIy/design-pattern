package iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/19 16:12
 */
public class Waitress {
    ArrayList menus;

    public Waitress(ArrayList menus){
        this.menus = menus;
    }

    public void printMenu(){
        Iterator menuIterator = menus.iterator();
        while(menuIterator.hasNext()){
            Menu menu = (Menu)menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    public void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName()+", ");
            System.out.println(menuItem.getPrice()+" -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
