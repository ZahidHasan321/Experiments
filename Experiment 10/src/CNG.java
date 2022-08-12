public class CNG implements Vehicle{
    private String vehicleName = "CNG";

    public String getVehicleName(){
        return vehicleName;
    }

    public void changeGear() {
        System.out.println("Gear changing of CNG");
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
