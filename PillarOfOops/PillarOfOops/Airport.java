package PillarOfOops;

import java.util.Scanner;

public class Airport {
    Scanner sc=new Scanner(System.in);
    void runAllFuntionality(){
        System.out.print("------------------------<<< ");
        System.out.print("Welcome to the Airport ");
        System.out.print(">>>------------------------");
        System.out.println(" ");
        while (true){
            System.out.println("Which Flight/Plane do you want enquire?");
            System.out.println("Please select the options given bellow");
            System.out.println("1.Cargo Plane \n"+"2.Passenger plane \n"+"3.Fighter Plane \n"+"4.Exit");
            int choice =sc.nextInt();
            if (choice==1){
                CargoPlane a =new CargoPlane();
                access(a);
            }else if (choice==2){
                PassengerPlane b =new PassengerPlane();
                access(b);
            }else if (choice==3){
                FighterPlane c=new FighterPlane();
                access(c);
            }else  if (choice==4){
                System.out.println("Thank you for visiting here \n "+"Have a nice day");
                sc.close();
                break;
            }else {
                System.out.println("Invalid input..Something went wrong, Please try again ");
            }

        }
    }

    private void access(Plane d ) {
        System.out.println("---------------------------");
        d.fly();
        d.land();
        System.out.println("---------------------------");

    }
}
abstract class Plane extends Airport{
    String PlaneType;

    public String getPlaneType() {
        return PlaneType;
    }

    public void setPlaneType(String planeType) {
        PlaneType = planeType;
    }

    void takeOff(){
        System.out.println("Plane took off");
    }
    void fly(){


    }
    void land(){
        System.out.println(this.getPlaneType()+"landing");
    }
}