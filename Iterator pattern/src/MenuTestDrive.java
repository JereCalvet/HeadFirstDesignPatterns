import menudomain.DinerMenu;
import menudomain.Menu;
import menudomain.PancakeHouseMenu;
import menudomain.StarBuzzMenu;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        StarBuzzMenu starBuzzMenu = new StarBuzzMenu();

        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        menus.add(starBuzzMenu);

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
