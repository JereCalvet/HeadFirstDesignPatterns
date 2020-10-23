package v2compositeiterator;

import v2compositeiterator.menusdomain.Menu;
import v2compositeiterator.menusdomain.MenuComponent;
import v2compositeiterator.menusdomain.MenuItem;
import v2compositeiterator.menusdomain.Waitress;

public class MenuTestDrive {

    public static void main(String[] args) {
        //Waitress waitress = new Waitress(createAllMenus());
        //Waitress waitress = new Waitress(createSingleMenu());
        Waitress waitress = new Waitress(createOneLeafOneNodeMenu());

        //waitress.printMenu();
        waitress.printVegetarianMenu();
    }

    public static MenuComponent createOneLeafOneNodeMenu() {
        MenuComponent pizzaMenu = new Menu("PIZZA MENU", "Launch");
        pizzaMenu.add(new MenuItem("PIZZA ROQUEFORT", "Pizza cheese roquefort", true, 15.0));

        MenuComponent mozzarellasMenu = new Menu("PIZZA MOZZARELLA MENUS", "anytime");
        mozzarellasMenu.add(new MenuItem("PIZZA MOZZA ONLY", "Sauce and cheese", true, 8.0));
        mozzarellasMenu.add(new MenuItem("PIZZA FUGAZZA", "Onion and cheese", true, 10.0));
        mozzarellasMenu.add(new MenuItem("PIZZA SPECIAL FUGAZZA", "Onion, eggs and cheese", false, 11.0));
        mozzarellasMenu.add(new MenuItem("PIZZA FUGAZZA MONSTER", "A LOT of onions, tuna and cheese", false, 18.0));

        pizzaMenu.add(mozzarellasMenu);

        return pizzaMenu;
    }

    public static MenuComponent createLeafOnlyMenus() {
        MenuComponent empanadasMenu = new Menu("EMPANADAS MENU", "Dinner");

        empanadasMenu.add(new MenuItem("EMPANADAS DE CARNE", "Carne salada", false, 20.0));
        empanadasMenu.add(new MenuItem("EMPANADAS DE VEGANAS", "Mix verduras", true, 18.0));
        empanadasMenu.add(new MenuItem("EMPANADAS DE HUMITA", "Choclo", true, 15.0));
        empanadasMenu.add(new MenuItem("EMPANADAS DE JAMON Y QUESO", "Jamon y queso muzzarella", false, 16.0));

        return empanadasMenu;
    }

    public static MenuComponent createLeafAndNodesMenus() {
        MenuComponent pancakeHouseMenu =
                new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu =
                new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu =
                new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu =
                new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem(
                "K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99));
        pancakeHouseMenu.add(new MenuItem(
                "Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99));
        pancakeHouseMenu.add(new MenuItem(
                "Blueberry Pancakes",
                "Pancakes made with fresh blueberries, and blueberry syrup",
                true,
                3.49));
        pancakeHouseMenu.add(new MenuItem(
                "Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59));

        dinerMenu.add(new MenuItem(
                "Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true,
                2.99));
        dinerMenu.add(new MenuItem(
                "BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                2.99));
        dinerMenu.add(new MenuItem(
                "Soup of the day",
                "A bowl of the soup of the day, with a side of potato salad",
                false,
                3.29));
        dinerMenu.add(new MenuItem(
                "Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false,
                3.05));
        dinerMenu.add(new MenuItem(
                "Steamed Veggies and Brown Rice",
                "A medly of steamed vegetables over brown rice",
                true,
                3.99));

        dinerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                3.89));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream",
                true,
                1.59));
        dessertMenu.add(new MenuItem(
                "Cheesecake",
                "Creamy New York cheesecake, with a chocolate graham crust",
                true,
                1.99));
        dessertMenu.add(new MenuItem(
                "Sorbet",
                "A scoop of raspberry and a scoop of lime",
                true,
                1.89));

        cafeMenu.add(new MenuItem(
                "Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true,
                3.99));
        cafeMenu.add(new MenuItem(
                "Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false,
                3.69));
        cafeMenu.add(new MenuItem(
                "Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true,
                4.29));

        return allMenus;
    }
}
