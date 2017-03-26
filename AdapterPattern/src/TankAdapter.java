/**
 * Created by rixvan on 3/17/2017.
 */
public class TankAdapter implements iAttacker {
    Tank tank;
    public TankAdapter() {
      tank  =new Tank();
    }
    @Override
    public void Walking() {
        tank.DriveForward();
    }

    @Override
    public void PunchHuman() {
tank.FireWeapon();
    }

    @Override
    public void RoboName(String roboName) {
tank.DriverName(roboName);
    }
}
