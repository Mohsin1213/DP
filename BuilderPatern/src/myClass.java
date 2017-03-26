/**
 * Created by rixvan on 3/17/2017.
 */
public class myClass {
    public static void main(String[] args) {
        MealBuilder mealBuilder= new MealBuilder();
        System.out.println("my veg things");

       Meals meals= mealBuilder.MakeMealVeg();
       meals.ShowItem();
      System.out.println("total COst : "+ meals.TotalCost());
    }
    }
