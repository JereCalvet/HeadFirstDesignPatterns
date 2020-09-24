package ingredientdomain.factories;


import ingredientdomain.ingredients.cheese.Cheese;
import ingredientdomain.ingredients.cheese.ReggianoCheese;
import ingredientdomain.ingredients.clam.Clams;
import ingredientdomain.ingredients.clam.FreshClams;
import ingredientdomain.ingredients.dough.Dough;
import ingredientdomain.ingredients.dough.ThinCrustDough;
import ingredientdomain.ingredients.pepperoni.Pepperoni;
import ingredientdomain.ingredients.pepperoni.SlicedPepperoni;
import ingredientdomain.ingredients.sauce.MarinaraSauce;
import ingredientdomain.ingredients.sauce.Sauce;
import ingredientdomain.ingredients.veggies.*;

public class NyPizzaIngredientFactory implements PizzaIngredientFactory {


    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
