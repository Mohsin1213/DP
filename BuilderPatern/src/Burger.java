/**
 * Created by rixvan on 3/17/2017.
 */
public abstract class Burger implements Item {
   @Override
    public Pack Packing() {
        return new Wrapper();
    }


}
