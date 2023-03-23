package PillarOfOops;

public class CargoPlane extends Plane {
    void fly(){
        super.takeOff();
        System.out.println("Cargo Plane fly at the low height");

        carryGoods();
        super.setPlaneType("Cargo Plane");
    }
    private void carryGoods() {
        System.out.println("Cargo plane can carries goods");
    }

}

