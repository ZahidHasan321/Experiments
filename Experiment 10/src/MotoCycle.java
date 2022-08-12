public class MotoCycle implements Vehicle{
    private String vehicleName = "Moto Cycle";

    public String getVehicleName(){
        return vehicleName;
    }

    public void changeGear() {
        System.out.println("Gear changing of Moto Cycle");
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
