/**
 * Created by rixvan on 3/17/2017.
 */
public class myClass {
    public static void main(String[] args) {
        CloningFactory cloningFactory= new CloningFactory();
        Sheep oSheep= new Sheep();
        Sheep osheepRef=oSheep;
        Sheep oSheepClone=(Sheep) cloningFactory.getClone(oSheep);
        System.out.println(oSheep.hashCode());
        System.out.println(osheepRef.hashCode());
        System.out.println(oSheepClone.hashCode());
    }
    }
