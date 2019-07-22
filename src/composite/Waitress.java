package composite;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/22 10:46
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }
}
