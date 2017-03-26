/**
 * Created by rixvan on 3/17/2017.
 */
public class MealBuilder {
    public Meals MakeMealVeg()
    {
        Meals meals= new Meals();
        meals.addItem(new VegBurgerb());
        meals.addItem(new CokaCola());


        return meals;
    }
    public Meals MakeMealChicken()
    {
        Meals meals= new Meals();
        meals.addItem(new ChickenBurger());
        meals.addItem(new CokaCola());


        return meals;
    }
}
