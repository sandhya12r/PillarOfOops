package PillarOfOops;

public class FighterPlane extends Plane{
    void fly(){
        super.takeOff();
        System.out.println("Fighter Plane fly at the Medium heights ");
        CarryWeapons();
        super.setPlaneType("Fighter Plane");
    }

    private void CarryWeapons() {
        System.out.println("Fighter Plane Carry Weapons");
    }
}
