public class MicroBus implements Vehicle{
    private String vehicleName = "Micro Bus";

    public String getVehicleName(){
        return vehicleName;
    }

    public void changeGear() {
        System.out.println("Gear changing of Micro Bus");
    }

    public void speedUp() {
        System.out.println("Speed up");
    }

    public void speedDown() {
        System.out.println("Speed Down");
    }

    public void pressBreak() {
        System.out.println("Break");
    }
}
