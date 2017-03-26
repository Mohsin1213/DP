/**
 * Created by rixvan on 3/17/2017.
 */
public class Robot implements iAttacker {
    @Override
    public void Walking() {
        System.out.println("Robo Walking");
    }

    @Override
    public void PunchHuman() {
        System.out.println("Robo Punching");
    }

    @Override
    public void RoboName(String roboName) {
        System.out.println("Robo Name : "+ roboName);
    }
}
