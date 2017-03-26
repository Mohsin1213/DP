/**
 * Created by rixvan on 3/17/2017.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Pack Packing() {
        return new Bottle();
    }
}
