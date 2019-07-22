package iterator;

import java.util.ArrayList;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/19 16:16
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        ArrayList allMenus = new ArrayList();
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
