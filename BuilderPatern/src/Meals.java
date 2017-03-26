import java.util.ArrayList;
import java.util.List;

/**
 * Created by rixvan on 3/17/2017.
 */
public class Meals {
    List<Item> meals=new ArrayList<Item>();
    public Meals()
    {

    }
    public void addItem(Item item)
    {
        meals.add(item);
    }
    public float TotalCost()
    {
        float cost=0;
        for(Item item :meals)
        {
                cost+=item.price();
        }
        return cost;
    }
    public void ShowItem()
    {
        for(Item item: meals)
        {
            System.out.println("Item Name "+item.Name());
            System.out.println("Item Packing "+item.Packing().PackingName());
            System.out.println("Item Cost "+item.price());
        }
    }
}
