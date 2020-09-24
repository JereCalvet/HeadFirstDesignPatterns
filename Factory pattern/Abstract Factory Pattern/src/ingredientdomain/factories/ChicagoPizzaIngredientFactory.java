package ingredientdomain.factories;


import ingredientdomain.ingredients.cheese.Cheese;
import ingredientdomain.ingredients.cheese.MozzarellaCheese;
import ingredientdomain.ingredients.clam.Clams;
import ingredientdomain.ingredients.clam.FrozenClams;
import ingredientdomain.ingredients.dough.Dough;
import ingredientdomain.ingredients.dough.ThickCrustDough;
import ingredientdomain.ingredients.pepperoni.Pepperoni;
import ingredientdomain.ingredients.pepperoni.SlicedPepperoni;
import ingredientdomain.ingredients.sauce.PlumTomatoSauce;
import ingredientdomain.ingredients.sauce.Sauce;
import ingredientdomain.ingredients.veggies.BlackOlives;
import ingredientdomain.ingredients.veggies.Eggplant;
import ingredientdomain.ingredients.veggies.Spinach;
import ingredientdomain.ingredients.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {


    @Override
    public Dough createDough() { return new ThickCrustDough(); }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] { new BlackOlives(), new Spinach(), new Eggplant() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
