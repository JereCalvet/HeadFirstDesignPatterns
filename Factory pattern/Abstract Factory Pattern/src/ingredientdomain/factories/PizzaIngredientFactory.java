package ingredientdomain.factories;

import ingredientdomain.ingredients.cheese.Cheese;
import ingredientdomain.ingredients.clam.Clams;
import ingredientdomain.ingredients.dough.Dough;
import ingredientdomain.ingredients.pepperoni.Pepperoni;
import ingredientdomain.ingredients.sauce.Sauce;
import ingredientdomain.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
