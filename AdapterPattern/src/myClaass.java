/**
 * Created by rixvan on 3/17/2017.
 */
public class myClaass {
    public static void main(String[] args) {
        iAttacker robo=new Robot();
        robo.PunchHuman();
        robo.RoboName("Rizvan");
        robo.Walking();
        robo=new TankAdapter();
        robo.PunchHuman();
        robo.Walking();
        robo.RoboName("Yousuf");
    }
    }
