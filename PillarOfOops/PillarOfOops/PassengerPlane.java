package PillarOfOops;

public class PassengerPlane extends Plane {
    void fly(){
        super.takeOff();
        System.out.println("Passenger Plane fly at medium hieghts ");
        carryPassenger();
        super.setPlaneType("Passenger Plane");
    }

    private void carryPassenger() {
        System.out.println("Passenger Plane Carry Passengers");
    }
}
