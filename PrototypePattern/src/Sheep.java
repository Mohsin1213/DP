/**
 * Created by rixvan on 3/17/2017.
 */
public class Sheep implements Animal {
    public  Sheep()
    {
        System.out.println("Making orignal Sheep");
    }
    @Override
    public Animal MakeCopy() {
        Sheep sheep=null;
        try {
            sheep = (Sheep) super.clone();
        }
        catch (Exception e)
        {

        }
        return sheep;
    }
}
